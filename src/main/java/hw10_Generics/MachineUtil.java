package hw10_Generics;

import java.util.HashMap;
import java.util.Map;

/**
 * Created with IntelliJ IDEA.
 * User: TaNik
 * Date: 05.12.16
 * Time: 19:19
 * To change this template use File | Settings | File Templates.
 */
public class MachineUtil {
    private MachineUtil(){
        throw new SecurityException();
    }

    public static <Key, Value> Map<Integer, String> addElement(Integer valueOfKey, String valueOfValue, Map<Integer, String> map){
          map.put(valueOfKey, valueOfValue);
        return map;
    }


}
