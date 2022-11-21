package findMostNumberCall;

import java.util.HashMap;
import java.util.Map;

public class MostLoopNumber {
    public static void main(String[] args) {
        int[] number = new int[1000];
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < number.length; i++) {
            number[i] = (int) (Math.random() * 1000);
            addElement(map, number[i]);
        }
        System.out.println(map);
        int max = 0;
        int mostLoopNumber = 0;
        for (int key : map.keySet()) {
            if (max < map.get(key)) {
                max = map.get(key);
                mostLoopNumber = key;
            }
        }
        System.out.println("So lap nhieu nhat la " + mostLoopNumber + "(so lap la " + max + ")");
    }

    public static void addElement(Map<Integer, Integer> list, int number) {
        if (list.containsKey(number)) {
            int count = list.get(number) + 1;
            list.put(number, count);
        } else {
            list.put(number, 1);
        }
    }
}
