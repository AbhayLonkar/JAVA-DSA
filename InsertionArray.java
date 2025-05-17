import java.lang.reflect.Array;
import java.util.Arrays;

public class InsertionArray {
    public static void main(String[] args) {
        int[] arr = new int[20];
        arr[0] = 1;
        arr[1] = 2;
        arr[2] = 3;
        arr[3] = 4;
        arr[4] = 5;
        arr[5] = 6;
        int count = 6;
        show(arr);
//        System.out.println(Arrays.toString(arr));

        insert(arr, 14,5, count);
        show(arr);
    }

    private static void show(int[] arr) {
        for (int x : arr) {
            System.out.print(x + " ");
        }
        System.out.println();
    }

    private static void insert(int[] arr, int elem, int post, int count) {
        for (int i = count; i >= post; i--) {
            arr[i+1] = arr[i];
        } arr[post] = elem;
    }

}
