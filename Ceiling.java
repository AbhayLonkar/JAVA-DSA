public class Ceiling {
    public static void main(String[] args) {
        int[] arr = {2,3,4,17,19,20,22,33,55,770};
        int ans = BinarySearch(arr, 21);
        System.out.println(ans);
    }

    // return the index
    static int BinarySearch(int[] arr, int target) {
        int start = 0;
        int end = arr.length - 1;
        while (start <= end) {
            // find the middle element
//            int mid = (start + end)/2;  // might be possible that (start + end) exceed the length of integer in java
            int mid = start + (end - start) / 2;
            if (target < arr[mid]) {
                end = mid - 1;
            } else if (target > arr[mid]) {
                start = mid + 1;
            } else {
                return mid;
            }
        }
        return start;
    }
}
