import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class Task17 {
    public static void main(String[] args) {
        LocalDate d1 = LocalDate.of(2026, 8, 1);
        LocalDate d2 = LocalDate.of(2026, 8, 13);

        long days = ChronoUnit.DAYS.between(d1, d2);

        System.out.println("Number of Days: " + days);
    }
}