import java.util.*;

public class Week2_Task2_Shuffle_the_Array {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] nums = new int[2 * n];

        for (int i = 0; i < 2 * n; i++) {
            nums[i] = sc.nextInt();
        }

        for (int i = 0; i < n; i++) {
            System.out.print(nums[i] + " " + nums[i + n] + " ");
        }
    }
}