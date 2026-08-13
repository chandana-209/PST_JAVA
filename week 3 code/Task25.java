import java.util.*;

class Task25 {
    public static void main(String[] args) {
        String[] names = {"Tanvi", "Chinnu", "Keerthana"};
        int[] heights = {180, 165, 170};

        Integer[] index = {0, 1, 2};
        Arrays.sort(index, (a, b) -> heights[b] - heights[a]);

        for (int i : index)
            System.out.print(names[i] + " ");
    }
}