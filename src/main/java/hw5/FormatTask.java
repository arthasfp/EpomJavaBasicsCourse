package hw5;

/**
 * Created by Sergii on 09.11.2016.
 */
public class FormatTask {
    public static void digitFormatter(int first, int second, int third){
        System.out.println(String.format("My first example one: %1$d, two: %2$d, three: %3$d", first, second, third));
    }
}
