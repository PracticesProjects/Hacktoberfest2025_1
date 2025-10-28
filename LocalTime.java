import java.time.*;
import java.time.temporal.ChronoUnit;

public class TimeDifferenceExample {
    public static void main(String[] args) {
        LocalTime start = LocalTime.of(9, 30, 0);  // 9:30 AM
        LocalTime end = LocalTime.of(14, 45, 30);  // 2:45:30 PM

        long hours = ChronoUnit.HOURS.between(start, end);
        long minutes = ChronoUnit.MINUTES.between(start, end);
        long seconds = ChronoUnit.SECONDS.between(start, end);

        System.out.println("Hours difference: " + hours);
        System.out.println("Minutes difference: " + minutes);
        System.out.println("Seconds difference: " + seconds);
    }
}
