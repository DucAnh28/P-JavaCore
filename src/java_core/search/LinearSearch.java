package java_core.search;

public class LinearSearch {
    public static void main(String[] args) {
        int[] arr = {1,2,3,34,5,65};
        System.out.println(linearSearch(arr,3));
    }

    static int linearSearch(int[] arr,int target){
        for (int j : arr) {
            if (j == target) {
                return 1;
            }
        }
        return -1;
    }
}
