import java.util.*;

class Task23 {
    public static void main(String[] args) {
        ArrayList<Integer> a = new ArrayList<>();
        a.add(30);
        a.add(10);
        a.add(20);

        a.sort((x, y) -> x - y);

        System.out.println(a);
    }
}