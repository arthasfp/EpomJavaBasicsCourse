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

    public void initializeIntArray(){
         for (int i = 0; i <array.length ; i++) {
            for (int j = 0; j <array[i].length ; j++) {
                array[i][j] = String.valueOf(UUID.randomUUID());
            }
        }
    }

    public void bubblesortIntArray(){
        for (int i = 0; i <array.length ; i++) {
            for (int j = 0; j < array[i].length-1; j++) {
                if (array[i][j].compareTo(array[i][j+1]) > 0) {
                    String temp = array[i][j];
                    array[i][j] = array[i][j+1];
                    array[i][j+1] = temp;
                }
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
