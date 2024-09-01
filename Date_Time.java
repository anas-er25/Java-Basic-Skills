import java.time.LocalTime; // import the LocalTime class
import java.time.LocalDate; // import the LocalDate class
import java.time.LocalDateTime; // import the LocalDateTime class
import java.time.format.DateTimeFormatter; // Import the DateTimeFormatter class
public class Date_Time {
    public static void main(){
        LocalTime Time = LocalTime.now();
        LocalDate Date = LocalDate.now();
        System.out.println("Time :" + Time);
        System.out.println("Date :" + Date);
        LocalDateTime DateTime = LocalDateTime.now();
        System.out.println("DateTime Before formatting: " + DateTime);
        DateTimeFormatter FormatDateTime = DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss");

        String formattedDate = DateTime.format(FormatDateTime);
        System.out.println("DateTime After formatting: " + formattedDate);
    }
}
