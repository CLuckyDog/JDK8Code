package test;

import java.util.HashMap;
import java.util.Map;

public class TestHashMap {
    public static void main(String[] args) {
        Map<String,Double> map = new HashMap<>();

        map.put("k1",1.0);
        map.put("k2",2.0);
        map.put("k2",3.0);
        map.put("k3",4.0);
        map.put("k4",5.0);
    }
}
