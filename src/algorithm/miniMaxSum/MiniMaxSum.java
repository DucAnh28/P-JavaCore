package algorithm.miniMaxSum;

import java_core.collection.Collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class MiniMaxSum {
    public static void miniMaxSum(List<Integer> arr) {
        Collections.sort(arr);
        long minSum = 0;
        long maxSum = 0;
        for (int i = 0; i < arr.size() - 1; i++) {
            minSum += arr.get(i);
        }
        for (int i = arr.size() - 1; i > 0; i--) {
            maxSum += arr.get(i);
        }
        System.out.print(minSum + " " + maxSum);
    }
}
