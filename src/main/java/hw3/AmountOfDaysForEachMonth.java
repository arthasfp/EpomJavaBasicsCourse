package hw3;

import java.time.Month;
import java.time.Year;

/**
 * Created by Sergii on 04.11.2016.
 */
public class AmountOfDaysForEachMonth {
   public static final int MONTH_AMOUNT_IN_THE_YEAR = 12;

   public static void getAmountOfDaysForEachMonth(int yearEx){

       // 2) загальну кількість днів для кожного місяця 2017 року;

       Year year = Year.of(yearEx);

       for (int i = 1; i <= MONTH_AMOUNT_IN_THE_YEAR; i++) {
           System.out.println("Кількість днів в місяці " + Month.of(i).toString() + " = " + year.atMonth(i).lengthOfMonth());
       }
   }
}
