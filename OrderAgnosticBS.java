    // for order of array
public class OrderAgnosticBS {
    public static void main(String[] args) {
//        int[] arr = {-18,-11,-1,5,9,11,22,44,45,78,88,98,99};
        int[] arr = {99,98,88,78,45,44,22,11,9,5,-1,-11,-18};
        int target = 22;
        int ans = orderAgnosticBS(arr, target);
        System.out.println(ans);
    }

    static int orderAgnosticBS(int[] arr, int target) {
        int start = 0;
        int end = arr.length - 1;

        // find whether the array is sorted in ascending or descending order
        boolean isAsc = arr[start] > arr[end];



        while (start <= end) {
            int mid = start + (end - start)/2;
            if (arr[mid] == target) {
                return mid;
            }
           if (isAsc) {
               if (target < arr[mid]) {
                   end = mid - 1;
               } else {
                   start = mid + 1;
               }
           } else {
               if (target > arr[mid]) {
                   end = mid - 1;
               } else{
                   start = mid + 1;
               }
           }
        }
        return -1;
    }
}
