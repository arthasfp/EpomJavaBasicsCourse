package hw10_Generics;

import java.util.HashMap;
import java.util.Map;

/**
 * Created with IntelliJ IDEA.
 * User: TaNik
 * Date: 05.12.16
 * Time: 19:14
 * To change this template use File | Settings | File Templates.
 */
public abstract class Machine<Key, Value> {
    private Key serialNumber;
    private Value name;

    private Map<Key, Value> machineHolder = new HashMap<>();

    public Map<Key, Value> getContent() {
        return machineHolder;
    }

    public void setContent(Map<Key, Value> machineHolder) {
        this.machineHolder = machineHolder;
    }

    public Key getSerialNumber() {
        return serialNumber;
    }

    public void setSerialNumber(Key serialNumber) {
        this.serialNumber = serialNumber;
    }

    public Value getName() {
        return name;
    }

    public void setName(Value name) {
        this.name = name;
    }

    protected Machine(Key elementKey, Value elementValue) {
        this.serialNumber = elementKey;
        this.name = elementValue;
    }
}
