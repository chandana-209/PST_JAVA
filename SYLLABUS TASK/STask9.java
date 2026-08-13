import java.util.*;

class STask9 {
    static int add(int a, int b) {
        return a + b;
    }

    static int divide(int a, int b) {
        return a / b;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        String op = sc.next();
        int b = sc.nextInt();

        int result = op.equals("+") ? add(a, b) : divide(a, b);

        System.out.println(result == (op.equals("+") ? a + b : a / b)
                ? "Test Passed" : "Test Failed");
    }
}