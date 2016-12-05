package hw10_Generics;

/**
 * Created with IntelliJ IDEA.
 * User: TaNik
 * Date: 05.12.16
 * Time: 19:46
 * To change this template use File | Settings | File Templates.
 */
public class MyApp {
    public static void main(String[] args) {
        Car car = new Car(565, "BMW");

        MachineUtil.addElement(car.getSerialNumber(), car.getName(),car.getContent() );


    }
}
