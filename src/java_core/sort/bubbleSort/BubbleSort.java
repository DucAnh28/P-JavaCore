package java_core.sort.bubbleSort;

public class BubbleSort {
    public static void main(String[] args) {
        int[] list = {2, 3, 5, 4, 9, 5, 6, 1, -2, 3, 14, 12};
        bubbleSort(list);
        for (int num : list) {
            System.out.print(num + " ");
        }
    }

    public static void bubbleSort(int[] array) {
        for (int i = 1; i < array.length; i++) {
            for (int j = 0; j < array.length - i; j++) {
                if (array[j] > array[j + 1]) {
                    int temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                }
            }
        }
    }
}
