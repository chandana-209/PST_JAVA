public class task8 {
    public static void main(String[] args) {

        int n = 10;   // Find the 10th Fibonacci number

        int a = 0, b = 1, c = 0;

        if (n == 1) {
            System.out.println("Fibonacci number = " + a);
        } else if (n == 2) {
            System.out.println("Fibonacci number = " + b);
        } else {
            for (int i = 3; i <= n; i++) {
                c = a + b;
                a = b;
                b = c;
            }

            System.out.println("The " + n + "th Fibonacci number is: " + c);
        }
    }
}