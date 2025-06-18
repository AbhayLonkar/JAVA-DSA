// 2351. First Letter to Appear Twice

import java.util.HashMap;
import java.util.Map;

public class ID2351 {
  public static void main(String[] args) {
    ID2351 solution = new ID2351();
    String s = "abccbaacz";
    System.out.println(solution.repeatedCharacter(s)); // Output: 'c'
  }

  public char repeatedCharacter(String s) {
    if (s.length() == 2)
      return s.charAt(0);
    Map<Character, Integer> map = new HashMap<>();
    for (char c : s.toCharArray()) {
      if (map.containsKey(c)) {
        if (map.get(c) >= 1) {
          return c;
        }
      }
      map.put(c, map.getOrDefault(c, 0) + 1);
    }
    return s.charAt(0);
  }
}
