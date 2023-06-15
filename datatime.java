import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class datatime {
    public static void main(String[] args) {
        // LocalTime time = LocalTime.now();

        // // Format the time in AM/PM format
        // DateTimeFormatter formatter = DateTimeFormatter.ofPattern("hh:mm:ss a");
        // String formattedTime = time.format(formatter);

        // System.out.println("Formatted Time: " + formattedTime);

     LocalDateTime datetime = LocalDateTime.now();

     DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-mm-mm hh:mm:SS a");

     String formattedtime = datetime.format(formatter);


        System.out.println(formattedtime);
    }
}
