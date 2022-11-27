package java_core.collection;

import java.util.HashMap;
import java.util.Map;

public class Collection {
    public static void main(String[] args) {
        // Map có thể có key null ko => có =)))
        Map<String, Integer> map = new HashMap<>();
        map.put(null,123);
        System.out.println(map.get(null));
    }
}
