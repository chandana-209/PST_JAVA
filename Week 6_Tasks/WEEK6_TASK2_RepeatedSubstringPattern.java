import java.util.*;

public class WEEK6_TASK2_RepeatedSubstringPattern {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String s = sc.next();

        String doubled = s + s;

        String middle = doubled.substring(1, doubled.length() - 1);

        if (middle.contains(s)) {
            System.out.println("true");
        } else {
            System.out.println("false");
        }

        sc.close();
    }
}