package java_core.sort;

public class SelectionSort {
    public static void main(String[] args) {
        int[] list = {2, 3, 5, 4, 9, 5, 6, 1, -2, 3, 14, 12};
        selectionSort(list);
        for (int num:
             list) {
            System.out.println(num + " ");
        }
    }

    public static void selectionSort(int[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {
            int min = i;
            for (int j = i + 1; j < arr.length; j++)
                if (arr[j] < arr[min]) min = j;
            int temp = arr[min];
            arr[min] = arr[i];
            arr[i] = temp;
        }
    }
}
