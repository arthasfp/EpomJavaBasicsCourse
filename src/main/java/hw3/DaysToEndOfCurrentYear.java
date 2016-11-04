package hw3;

import java.time.LocalDate;
import java.time.Year;

/**
 * Created by Sergii on 04.11.2016.
 */
public class DaysToEndOfCurrentYear {

    public static void getDaysToEndOfCurrentYear(){

        // 3) скільки днів залишилось від поточної дати до нового року;

        System.out.println("До кінця року залишилось " + (Year.now().length() - LocalDate.now().getDayOfYear()) + " днів");
    }
}
