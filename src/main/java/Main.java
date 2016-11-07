import hw3.AmountOfDaysForEachMonth;
import hw3.AmountOfDaysOffForEachMonth;
import hw3.CurrentFormattedDate;
import hw3.DaysToEndOfCurrentYear;
import hw4.TwoDimentionalIntArray;
import hw4.TwoDimentionalStringArray;

public class Main {
    public static void main(String[] args) {
       DaysToEndOfCurrentYear.getDaysToEndOfCurrentYear();
       CurrentFormattedDate.getCurrentFormattedDate();
       AmountOfDaysForEachMonth.getAmountOfDaysForEachMonth(2017);
       AmountOfDaysOffForEachMonth.getAmountOfDaysOffForEachMonth(2017);

        TwoDimentionalIntArray arrayFirst = new TwoDimentionalIntArray();
        arrayFirst.ininitializeIntArray();
        arrayFirst.printArray();
        System.out.println();
        arrayFirst.bubblesortIntArray();
        arrayFirst.printArray();
        System.out.println();

        TwoDimentionalIntArray arraySecond = new TwoDimentionalIntArray();
        arraySecond.ininitializeIntArray();
        arraySecond.sortIntArray();
        arraySecond.printArray();
        System.out.println();

        TwoDimentionalStringArray twoDimentionalStringArray = new TwoDimentionalStringArray();
        twoDimentionalStringArray.ininitializeIntArray();
        twoDimentionalStringArray.printArray();
    }
}
