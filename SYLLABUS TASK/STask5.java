import java.util.*;

class STask5 {
    static int balance = 0;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        for (int i = 0; i < n; i++) {
            String op = sc.next();
            int amount = sc.nextInt();

            if (op.equals("Deposit"))
                balance += amount;
            else
                balance -= amount;
        }

        System.out.println(balance);
    }
}