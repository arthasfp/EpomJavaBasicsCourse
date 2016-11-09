package hw5;

import java.time.Instant;
import java.util.Calendar;
import java.util.Date;

/**
 * Created by Sergii on 09.11.2016.
 */
public class FormatTask {
    public static void digitFormatter(int first, int second, int third){
        System.out.println(String.format("My first example one: %1$d, two: %2$d, three: %3$d", first, second, third));
    }
    //    The first 0 means "pad with zeros" and the 5 means "use five digits."
    public static void padsWithZeros(int numberOfRows){
        for (int i = 0; i < numberOfRows; i++) {
            System.out.println(String.format("%1$05d %2$05d %3$05d", i, i+11, i+i));
        }
    }
    //    The "f" format will round the number up, not truncate digits.
     public static void precision(int numberOfDigitsAfterComa){
        double example = 1.435563;
        System.out.println(String.format("Double value: %1$." + numberOfDigitsAfterComa + "f", example));
    }
    public static void insertStrings(String first, String second){
        System.out.println(String.format("I will insert them: %s, %s", first, second));
    }
    public static void argumentOrder(String valueOfString, int simpleNumber){
        System.out.println(String.format("First of all I need a number: %2$d. And string is not important: %1$s", valueOfString, simpleNumber));
    }
//    Right:    To specify padding on the right (ten spaces on the right) we use -10s. The result string is 10 chars.
//    Left:    To add padding to the left (right justify text) to 10 chars, we use 10s. No plus sign is used.
    public static void padding(String[] first, String[] second){
        for (int i = 0; i < first.length; i++) {
            String left = first[i];
            String right = second[i];
            System.out.println(String.format("%1$-10s %2$10s", left, right));
        }
    }
    public static void getCalendarDate(){
        Calendar calendar = Calendar.getInstance();
        calendar.set(2016, 11, 9);
        calendar.setTime(Date.from(Instant.now()));
        System.out.println(String.format("Month: %1$tB %1$tb %1$tm", calendar));
        System.out.println(String.format("Day: %1$tA %1$ta %1$td", calendar));
        System.out.println(String.format("Year: %1$tY %1$ty %1$tj", calendar));
        System.out.println(String.format("Hour: %1$tH %1$tI %1$tk %1$tl", calendar));
        System.out.println(String.format("Minute: %1$tM", calendar));
        System.out.println(String.format("Second: %1$tS", calendar));
        System.out.println(String.format("AM/PM: %1$tp", calendar));
    }
}
