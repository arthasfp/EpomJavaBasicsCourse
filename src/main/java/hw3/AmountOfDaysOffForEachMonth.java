package hw3;

import java.time.*;

/**
 * Created by Sergii on 04.11.2016.
 */
public class AmountOfDaysOffForEachMonth {
    public static void getAmountOfDaysOffForEachMonth(int yearEx) {

        // 1) кількість вихідних днів(субота і неділя) окремо для кожного місяця 2017 року;

        Year year = Year.of(yearEx);
        for (Month month : Month.values()) {
            int counter = 0;
            for (int i = 1; i <= month.maxLength(); i++) {
                MonthDay monthDay = MonthDay.of(month, i);
                LocalDate date = year.atMonthDay(monthDay);
                if (date.getDayOfWeek().equals(DayOfWeek.SUNDAY) || date.getDayOfWeek().equals(DayOfWeek.SATURDAY)) {
                    counter++;
                }
            }
            System.out.println(month.toString() + " " + counter);
        }
    }
}
