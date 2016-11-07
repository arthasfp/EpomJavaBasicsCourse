package hw4;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

/**
 * Created by Sergii on 08.11.2016.
 */
public class StringFormatter {

    public static void getStringWithDateFormatter(final String input){
    String template = input + " %s.";
    System.out.println(String.format(template, LocalDateTime.now().format(DateTimeFormatter.ofPattern( "dd MM yyyy"))));
    }
}
