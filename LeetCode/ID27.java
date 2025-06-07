// 27. Remove Element

public class ID27 {

  public static void main(String[] args) {
    ID27 solution = new ID27();
    int[] nums = { 3, 2, 2, 3 };
    int val = 3;
    int newLength = solution.removeElement(nums, val);

    System.out.println("New length: " + newLength);
    System.out.print("Modified array: ");
    for (int i = 0; i < newLength; i++) {
      System.out.print(nums[i] + " ");
    }
  }

  public int removeElement(int[] nums, int val) {
    int k = 0;
    for (int i = 0; i < nums.length; i++) {
      if (nums[i] != val) {
        nums[k] = nums[i];
        k++;
      }
    }
    return k;
  }
}
