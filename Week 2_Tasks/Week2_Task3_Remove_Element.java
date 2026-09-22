import java.util.*;

public class Week2_Task3_Remove_Element {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] nums = new int[n];

        for (int i = 0; i < n; i++)
            nums[i] = sc.nextInt();

        int value = sc.nextInt();
        int count = 0;

        for (int i = 0; i < n; i++) {
            if (nums[i] != value) {
                nums[count] = nums[i];
                count++;
            }
        }

        System.out.println(count);

        for (int i = 0; i < count; i++)
            System.out.print(nums[i] + " ");
    }
}