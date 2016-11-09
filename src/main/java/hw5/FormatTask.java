package hw5;

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
}
