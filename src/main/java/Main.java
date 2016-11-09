import hw4.StringFormatter;
import hw5.Gender;

import static hw4.StringTester.*;

public class Main {
    public static void main(String[] args) {
//       DaysToEndOfCurrentYear.getDaysToEndOfCurrentYear();
//       CurrentFormattedDate.getCurrentFormattedDate();
//       AmountOfDaysForEachMonth.getAmountOfDaysForEachMonth(2017);
//       AmountOfDaysOffForEachMonth.getAmountOfDaysOffForEachMonth(2017);
//
//        TwoDimentionalIntArray arrayFirst = new TwoDimentionalIntArray();
//        arrayFirst.initializeIntArray();
//        arrayFirst.printArray();
//        System.out.println();
//        arrayFirst.bubblesortIntArray();
//        arrayFirst.printArray();
//        System.out.println();
//
//        TwoDimentionalIntArray arraySecond = new TwoDimentionalIntArray();
//        arraySecond.initializeIntArray();
//        arraySecond.sortIntArray();
//        arraySecond.printArray();
//        System.out.println();
//
//        TwoDimentionalStringArray twoDimentionalFirstStringArray = new TwoDimentionalStringArray();
//        twoDimentionalFirstStringArray.initializeStringArray();
//        twoDimentionalFirstStringArray.printStringArray();
//        System.out.println();
//        twoDimentionalFirstStringArray.bubblesortStringArray();
//        twoDimentionalFirstStringArray.printStringArray();
//        System.out.println();
//        TwoDimentionalStringArray twoDimentionalSecondStringArray = new TwoDimentionalStringArray();
//        twoDimentionalSecondStringArray.initializeStringArray();
//        twoDimentionalSecondStringArray.printStringArray();
//        System.out.println();
//        twoDimentionalSecondStringArray.sortStringArray();
//        twoDimentionalSecondStringArray.printStringArray();
//        System.out.println();

//        String test = null;
//        String test2 = "Це не пустий рядок";
//        System.out.println(isEmpty(test));
//        System.out.println(isEmpty(test2));
//        System.out.println();
//
//        String test3 = "Це оригінальний рядок";
//        System.out.println(reverse(test3));
//        System.out.println();
//
//        String test4 = "Хочу прибрати всі пробіли";
//        System.out.println(removeWhiteSpaces(test4));
//        System.out.println();
//
//        String test5 = "Хочу прибрати всі пробілиХочу прибрати всі пробілиХочу прибрати всі пробілиХочу прибрати всі пробіли";
//        System.out.println(countOccurrences(test5, "Хочу"));
//        System.out.println();
//
//        String test6 = "Сьогодні";
//        StringFormatter.getStringWithDateFormatter(test6);
        doHouseWork(Gender.FEMALE);

        Gender genderInstance = Gender.MALE;
        System.out.println(genderInstance.getId() + ": " + genderInstance.getTitle());

        for (Gender gender: Gender.values()){
            gender.getFavoriteBehavior();
        }

    }

    public static void doHouseWork(Gender gender){
        switch (gender) {
            case MALE:
                System.out.println("Дивитись телевізор");
                break;
            case FEMALE:
                System.out.println("Варити борщ");
                break;
            default:
                System.out.println("Лежати на дивані!");
        }
    }
}
