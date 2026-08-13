import java.time.LocalDate;

public class Task19 {
    public static void main(String[] args) {
        LocalDate date = LocalDate.of(2026, 8, 13);
        System.out.println("Day: " + date.getDayOfWeek());
    }
}