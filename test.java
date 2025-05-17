import java.util.Arrays;

// 34. Find First and Last Position of Element in Sorted Array
public class test {

    public static void main(String[] args) {
        int[] num = {5,7,7,8,8,10};
        int target = 8;
        System.out.println(Arrays.toString(searchRange(num, target)));
    }

    static int[] searchRange(int[] nums, int target) {
        int[] ans = {-1,-1};
        int start = 0;
        int end = nums.length;
        if (nums.length == 0) {
            return ans;
        }

        if (nums[start] > target || nums[end - 1] < target) {
            return ans;
        }
        for (int i = start; i< end; i++ ) {
            if (nums[i] == target) {
                ans[0] = i;
                break;
            }
        }
        for (int i = end - 1; i >= 0; i--) {
            if (nums[i] == target) {
                ans[1] = i;
                break;
            }
        }
        return ans;
    }

}
