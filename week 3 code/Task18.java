import java.time.LocalDate;

public class Task18 {
    public static void main(String[] args) {
        LocalDate date = LocalDate.of(2026, 8, 13);

        System.out.println("Day of the Year: " + date.getDayOfYear());
    }
}