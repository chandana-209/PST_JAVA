import java.util.Arrays;

public class task5 {
    public static void main(String[] args) {

        int[] arr = {12, 3, 5, 7, 19};
        int k = 2;

        Arrays.sort(arr);

        System.out.println("The " + k + "th smallest element is: " + arr[k - 1]);
    }
}