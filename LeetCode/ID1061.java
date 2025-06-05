// 1061. Lexicographically Smallest Equivalent String

import java.util.*;

public class ID1061 {
  public static void main(String[] args) {
    String s1 = "leetcode";
    String s2 = "programs";
    String baseStr = "sourcecode";
    ID1061 solution = new ID1061();
    System.out.println(solution.smallestEquivalentString(s1, s2, baseStr)); // Output: true
  }

  public String smallestEquivalentString(String s1, String s2, String baseStr) {
    Map<Character, Set<Character>> mapping = new HashMap<>();
    for (int i = 0; i < s1.length(); i++) {
      char c1 = s1.charAt(i);
      char c2 = s2.charAt(i);
      mapping.putIfAbsent(c1, new HashSet<>());
      mapping.putIfAbsent(c2, new HashSet<>());
      mapping.get(c1).add(c2);
      mapping.get(c2).add(c1);
    }

    for (Map.Entry<Character, Set<Character>> entry : mapping.entrySet()) {
      char key = entry.getKey();
      Set<Character> values = entry.getValue();
      System.out.println(key + " -> " + values);

    }

    String ans = "";
    for (int i = 0; i < baseStr.length(); i++) {
      char c = baseStr.charAt(i);
      int[] visited = new int[26];
      if (mapping.containsKey(c)) {
        ans += findMinChar(c, mapping, visited);
      } else {
        ans += c;
      }
    }
    return ans;
  }

  char findMinChar(char c, Map<Character, Set<Character>> mapping, int[] visited) {
    visited[c - 'a'] = 1; // Mark this character as visited

    char curr_c = c;
    for (char x : mapping.get(curr_c)) {
      if (visited[x - 'a'] == 0) {
        char minChar = findMinChar(x, mapping, visited);
        if (minChar < curr_c) {
          curr_c = minChar; // Update current character if a smaller one is found
        }
      }
    }
    return curr_c;
  }

}
