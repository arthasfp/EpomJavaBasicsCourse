package hw3;

import java.time.Month;
import java.time.Year;

/**
 * Created by Sergii on 04.11.2016.
 */
public class AmountOfDaysForEachMonth {
   public static void getAmountOfDaysForEachMonth(int yearEx){

       // 2) загальну кількість днів для кожного місяця 2017 року;

       Year year = Year.of(yearEx);
       for (int i = 1; i <= 12 ; i++) {
           System.out.println("Кількість днів в місяці " + Month.of(i).toString() + " = " + year.atMonth(i).lengthOfMonth());
       }
   }
}
