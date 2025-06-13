// 41. First Missing Positive

public class ID41 {

  public static void main(String[] args) {
    ID41 solution = new ID41();
    int[] arr = { 2, -3, 4, 1, 1, 7 };
    System.out.println(solution.firstMissingPositive(arr)); // Output: 3
  }

  public int firstMissingPositive(int[] arr) {
    int n = arr.length;
    for (int i = 0; i < n; i++) {
      while (arr[i] >= 1 && arr[i] <= n && arr[i] != arr[arr[i] - 1]) {
        int correctIndex = arr[i] - 1;
        int temp = arr[i];
        arr[i] = arr[correctIndex];
        arr[correctIndex] = temp;
      }
    }
    for (int i = 0; i < n; i++) {
      if (arr[i] != i + 1) {
        return i + 1;
      }
    }

    return arr[n - 1] + 1;
  }
}