import java.util.Arrays;

class Solution {
    public int[] Week2_Task1_BuildArrayFromPermutation(int[] nums) {
        int n = nums.length;

        for (int i = 0; i < n; i++) {
            nums[i] += (nums[nums[i]] % n) * n;
        }

        for (int i = 0; i < n; i++) {
            nums[i] /= n;
        }

        return nums;
    }

    public static void main(String[] args) {
        Solution s = new Solution();
        int[] nums = {4, 0, 2, 1, 3};

        System.out.println(Arrays.toString(s.Week2_Task1_BuildArrayFromPermutation
            (nums)));
    }
}