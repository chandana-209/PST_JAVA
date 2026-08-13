import java.util.*;

class STask10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        for (int i = 0; i < n; i++) {
            String user = sc.next();
            String pass = sc.next();

            if (user.length() >= 3 && user.length() <= 20 &&
                pass.length() >= 6 && pass.length() <= 20 &&
                user.equals("admin") && pass.equals("admin123"))
                System.out.println("SUCCESS");
            else
                System.out.println("FAILURE");
        }
    }
}