import DirectoryService.DirectoryServiceImpl;
import hw5.Gender;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import static hw8.Recursion.fibonacci;
import static hw8.Recursion.getBigIntegerFactorial;
import static hw8.Recursion.getSimpleFactorial;

public class Main {
    public static void main(String[] args) throws IOException {
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
//        doHouseWork(Gender.FEMALE);
//
//        Gender genderInstance = Gender.MALE;
//        System.out.println(genderInstance.getId() + ": " + genderInstance.getTitle());
//
//        for (Gender gender: Gender.values()){
//            gender.getFavoriteBehavior();
//        }

//        digitFormatter(10, 20, 30);
//        padsWithZeros(8);
//        precision(4);
//        insertStrings(Gender.FEMALE.getTitle(), Gender.MALE.getTitle());
//        argumentOrder(genderInstance.getTitle(), genderInstance.getId());
//        padding(new String[]{"cat","dog","fish"}, new String[]{"love", "hate", "don't care"} );
//        getCalendarDate();
        System.out.println(getSimpleFactorial(8));
        System.out.println(getBigIntegerFactorial(8));
        System.out.println(fibonacci(10));

//        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
//        DirectoryServiceImpl service = new DirectoryServiceImpl();
//        System.out.println(service.searchByName(reader.readLine()));
//
//        reader.close();

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
