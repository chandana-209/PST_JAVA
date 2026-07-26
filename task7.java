public class task7 {
    public static void main(String[] args) {

        int num = 123456;
        int sum = 0;

        while (num > 0) {
            int digit = num % 10;

            if (digit % 2 == 0) {
                sum = sum + digit;
            }

            num = num / 10;
        }

        System.out.println("Sum of even digits = " + sum);
    }
}