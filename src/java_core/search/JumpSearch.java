package java_core.search;

public class JumpSearch {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        System.out.println(jumpSearch(arr,4));
    }

    static int jumpSearch(int[] a, int target) {
        int blockSize = (int) Math.sqrt(a.length);
        int start = 0;
        int next = blockSize;
        while (start < a.length && target > a[next - 1]) {
            start = next;
            next += blockSize;
            if (next >= a.length) {
                next = a.length;
            }
        }
        for (int i = start; i < next; i++) {
            if (target == a[i]) {
                return i;
            }
        }
        return -1;
    }
}
