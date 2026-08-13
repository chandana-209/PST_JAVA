import java.util.*;

class STask3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int max = sc.nextInt();
        int sum = max;

        for (int i = 1; i < n; i++) {
            int x = sc.nextInt();
            sum = Math.max(x, sum + x);
            max = Math.max(max, sum);
        }

        System.out.println(max);
    }
}