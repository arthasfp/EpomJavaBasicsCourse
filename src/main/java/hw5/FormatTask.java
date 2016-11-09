package hw5;

/**
 * Created by Sergii on 09.11.2016.
 */
public class FormatTask {
    public static void digitFormatter(int first, int second, int third){
        System.out.println(String.format("My first example one: %1$d, two: %2$d, three: %3$d", first, second, third));
    }
    public static void padsWithZeros(int numberOfRows){
        for (int i = 0; i < numberOfRows; i++) {
            System.out.println(String.format("%1$05d %2$05d %3$05d", i, i+11, i+i));
        }
    }
}
