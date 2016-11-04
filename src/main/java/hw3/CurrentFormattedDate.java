package hw3;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

/**
 * Created by Sergii on 04.11.2016.
 */
public class CurrentFormattedDate {
    public static void getCurrentFormattedDate(){

        // 4) показати (окремо) поточну хвилину/годину/день/місяць/рік

        System.out.println(LocalDateTime.now().format(DateTimeFormatter.ofPattern( "mm:HH dd MM yyyy")));
    }
}
