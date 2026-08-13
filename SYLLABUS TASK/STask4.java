import java.util.*;

class STask4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String text = sc.nextLine();
        String pat = sc.nextLine();

        int[] lps = new int[pat.length()];

        for (int i = 1, j = 0; i < pat.length();) {
            if (pat.charAt(i) == pat.charAt(j))
                lps[i++] = ++j;
            else if (j > 0)
                j = lps[j - 1];
            else
                i++;
        }

        for (int i = 0, j = 0; i < text.length();) {
            if (text.charAt(i) == pat.charAt(j)) {
                i++;
                j++;
            }

            if (j == pat.length()) {
                System.out.print((i - j) + " ");
                j = lps[j - 1];
            } else if (i < text.length() &&
                       text.charAt(i) != pat.charAt(j)) {
                if (j > 0)
                    j = lps[j - 1];
                else
                    i++;
            }
        }
    }
}