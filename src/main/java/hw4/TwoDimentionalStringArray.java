package hw4;

import java.util.Random;
import java.util.UUID;

/**
 * Created by Sergii on 05.11.2016.
 */
public class TwoDimentionalStringArray {
    private final String[][] array;

    public TwoDimentionalStringArray() {
        array = new String[3][3];
    }

    public String[][] getArray() {
        return array;
    }

    public void ininitializeIntArray(){
         for (int i = 0; i <array.length ; i++) {
            for (int j = 0; j <array[i].length ; j++) {
                array[i][j] = String.valueOf(UUID.randomUUID());
            }
        }
    }

    public void printArray(){
        for (int i = 0; i <array.length ; i++) {
            System.out.println();
            for (int j = 0; j <array[i].length ; j++) {
                System.out.print(array[i][j]+ " ");
            }
        }
    }
}
