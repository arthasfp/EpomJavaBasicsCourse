import hw3.AmountOfDaysForEachMonth;
import hw3.AmountOfDaysOffForEachMonth;
import hw3.CurrentFormattedDate;
import hw3.DaysToEndOfCurrentYear;

public class Main {
    public static void main(String[] args) {
       DaysToEndOfCurrentYear.getDaysToEndOfCurrentYear();
       CurrentFormattedDate.getCurrentFormattedDate();
       AmountOfDaysForEachMonth.getAmountOfDaysForEachMonth(2017);
       AmountOfDaysOffForEachMonth.getAmountOfDaysOffForEachMonth(2017);

        System.out.println("Test change");
    }
}
