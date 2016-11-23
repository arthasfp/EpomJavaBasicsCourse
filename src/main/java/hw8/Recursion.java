package hw8;

import java.math.BigInteger;

/**
 * Created by Sergii on 17.11.2016.
 */
public class Recursion {

    public static int getSimpleFactorial(int value){
        if (value == 0)
            return 1;
        return value* getSimpleFactorial(value-1);

    }


}
