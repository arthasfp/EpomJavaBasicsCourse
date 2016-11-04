import hw3.AmountOfDaysForEachMonth;
import hw3.AmountOfDaysOffForEachMonth;
import hw3.CurrentFormattedDate;
import hw3.DaysToEndOfCurrentYear;
import hw4.TwoDimentionalIntArray;

public class Main {
    public static void main(String[] args) {
       DaysToEndOfCurrentYear.getDaysToEndOfCurrentYear();
       CurrentFormattedDate.getCurrentFormattedDate();
       AmountOfDaysForEachMonth.getAmountOfDaysForEachMonth(2017);
       AmountOfDaysOffForEachMonth.getAmountOfDaysOffForEachMonth(2017);

        TwoDimentionalIntArray array = new TwoDimentionalIntArray();
        array.ininitializeIntArray();
        array.printArray();
        System.out.println();
        array.bubblesortIntArray();
        array.printArray();
        System.out.println();

        TwoDimentionalIntArray array1 = new TwoDimentionalIntArray();
        array1.ininitializeIntArray();
        array1.sortIntArray();
        array1.printArray();
    }
}
