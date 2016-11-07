package hw4;

import java.util.Arrays;
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

    public String[][] getStringArray() {
        return array;
    }

    public void initializeStringArray(){
         for (int i = 0; i <array.length ; i++) {
            for (int j = 0; j <array[i].length ; j++) {
                array[i][j] = String.valueOf(UUID.randomUUID());
            }
        }
    }

    public void bubblesortStringArray(){
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

    public void sortStringArray(){
        for (int i = 0; i <array.length ; i++) {
            Arrays.sort(array[i]);
        }
    }

    public void printStringArray(){
        for (int i = 0; i <array.length ; i++) {
            System.out.println();
            for (int j = 0; j <array[i].length ; j++) {
                System.out.print(array[i][j]+ " ");
            }
        }
    }
}
