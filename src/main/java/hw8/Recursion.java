package hw8;

import java.math.BigInteger;

/**
 * Created by Sergii on 17.11.2016.
 */
public class Recursion {

    public static int getSimpleFactorial(int value){
        if (value < 0) throw new IllegalArgumentException("x должен быть положительным.");
        if (value == 0)
            return 1;
        return value* getSimpleFactorial(value-1);

    }

    public static BigInteger getBigIntegerFactorial(int value){
        if (value < 0) throw new IllegalArgumentException("x должен быть положительным.");
        BigInteger factorial = BigInteger.ONE;
        for (int i = 1; i <= value; i++) {
            factorial = factorial.multiply(BigInteger.valueOf(i));
        }
        return factorial;
    }

    public static int fibonacci(int value){
        if(value == 1) return 1;
        if(value == 2) return 2;
        return fibonacci(value - 1) + fibonacci(value - 2);
    }

}
