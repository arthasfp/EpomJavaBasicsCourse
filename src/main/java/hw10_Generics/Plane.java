package hw10_Generics;

/**
 * Created with IntelliJ IDEA.
 * User: TaNik
 * Date: 05.12.16
 * Time: 19:11
 * To change this template use File | Settings | File Templates.
 */
public class Plane extends Machine<Long, String> {

    protected Plane(Long elementKey, String elementValue) {
        super(elementKey, elementValue);
    }
}
