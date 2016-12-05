package hw10_Generics;

/**
 * Created with IntelliJ IDEA.
 * User: TaNik
 * Date: 05.12.16
 * Time: 19:10
 * To change this template use File | Settings | File Templates.
 */
public class Car extends Machine<Integer, String>{

    protected Car(Integer elementKey, String elementValue) {
        super(elementKey, elementValue);
    }
}
