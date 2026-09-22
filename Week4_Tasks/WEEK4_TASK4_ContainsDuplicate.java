import java.util.HashSet;
import java.util.Scanner;

public class WEEK4_TASK4_ContainsDuplicate {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        HashSet<Integer> set = new HashSet<>();

        boolean duplicate = false;

        for (int i = 0; i < n; i++) {
            int num = sc.nextInt();

            if (set.contains(num)) {
                duplicate = true;
            }

            set.add(num);
        }

        System.out.println(duplicate);

        sc.close();
    }
}