
// 242. Valid Anagram
import java.util.*;

public class ID242 {
  public static void main(String args[]) {
    ID242 solution = new ID242();
    String s = "anagram";
    String t = "nagaram";
    System.out.println(solution.isAnagram(s, t)); // Output: true

    s = "rat";
    t = "car";
    System.out.println(solution.isAnagram(s, t)); // Output: false
  }

  public boolean isAnagram(String s, String t) {
    Map<Character, Integer> map = new HashMap<Character, Integer>();
    for (char c : s.toCharArray()) {
      map.put(c, map.getOrDefault(c, 0) + 1);
    }
    for (char c : t.toCharArray()) {
      if (!map.containsKey(c)) {
        return false;
      }
      map.put(c, map.get(c) - 1);
      if (map.get(c) < 0) {
        return false;
      }
    }
    for (Map.Entry<Character, Integer> entry : map.entrySet()) {
      if (entry.getValue() > 0) {
        return false;
      }
    }
    return true;
  }
}