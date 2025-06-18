// 387. First Unique Character in a String

import java.util.HashMap;
import java.util.Map;

public class ID387 {
  public static void main(String[] args) {
    ID387 solution = new ID387();
    String s = "leetcode";
    System.out.println(solution.firstUniqChar(s)); // Output: 0

  }

  public int firstUniqChar(String s) {
    int n = s.length();
    if (n == 1)
      return 0;

    Map<Character, Integer> map = new HashMap<>();
    for (char c : s.toCharArray()) {
      map.put(c, map.getOrDefault(c, 0) + 1);
    }

    for (int i = 0; i < n; i++) {
      if (map.get(s.charAt(i)) == 1) {
        return i;
      }
    }
    return -1;

  }

}