import java.util.Arrays;

// 34. Find First and Last Position of Element in Sorted Array
public class LeetCode_34 {

    public static void main(String[] args) {
        int[] num = {5,7,7,8,8,10};
        int target = 8;
        System.out.println(Arrays.toString(searchRange(num, target)));
    }

    static int[] searchRange(int[] nums, int target) {
        int[] ans = {-1,-1};

        int start = search(nums, target, true);
        int end = search(nums, target, false);
        ans[0] = start;
        ans[1] = end;
        return ans;
    }

    static int search(int[] nums, int target, boolean isFindingStartIndex) {
        int ans = -1;
        int start = 0;
        int end = nums.length - 1;
        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (target < nums[mid]) {
                end = mid - 1;
            } else if (target > nums[mid]) {
                start = mid + 1;
            } else {
                ans = mid;
                if (isFindingStartIndex) {
                    end = mid -1;
                } else {
                    start = mid + 1;
                }
            }
        }
        return ans;
    }
}
