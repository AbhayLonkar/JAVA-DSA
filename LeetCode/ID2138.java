// 2138. Divide a String Into Groups of Size k

import java.util.Arrays;

public class ID2138 {
  public static void main(String[] args) {
    ID2138 solution = new ID2138();
    String s = "abcdefg";
    int k = 3;
    char fill = 'x';
    System.out.println(Arrays.toString(solution.divideString(s, k, fill))); // Expected output: ["abc", "def", "gxx"]
  }

  public String[] divideString(String s, int k, char fill) {
    int n = s.length();
    int size = (int) Math.ceil((n / (float) k));
    String[] ans = new String[size];
    Arrays.fill(ans, "");
    int idx = 0;
    for (int i = 0; i < n; i++) {
      ans[idx] += s.charAt(i);
      if (i < n && (i + 1) % k == 0 && idx < size) {
        idx++;
      }
    }
    while (idx < size && ans[idx].length() < k) {
      ans[idx] += fill;
    }
    return ans;
  }
}