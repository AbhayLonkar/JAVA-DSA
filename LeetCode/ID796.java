// 796. Rotate String

public class ID796 {

  public static void main(String[] args) {
    ID796 solution = new ID796();
    String s = "abcde";
    String goal = "cdeab";
    // boolean result = solution.rotateString(s, goal);
    boolean result = solution.rotateStringConcat(s, goal);
    System.out.println("Can rotate: " + result); // Expected output: true
  }

  // Approach 1: Using KMP Algorithm
  // Time Complexity: O(n)
  // Space Complexity: O(n)
  public boolean rotateString(String s, String goal) {
    int n = goal.length();
    if (s.length() != n) {
      return false;
    }
    String txt = s + s;
    int m = txt.length();

    int[] lps = new int[n];
    computeLpsArray(lps, goal);

    int i = 0, j = 0;
    while (i < m) {
      if (txt.charAt(i) == goal.charAt(j)) {
        i++;
        j++;
      }

      if (j == n) {
        return true;
      } else if (i < m && txt.charAt(i) != goal.charAt(j)) {
        if (j != 0) {
          j = lps[j - 1];
        } else {
          i++;
        }
      }
    }
    return false;
  }

  public void computeLpsArray(int[] lps, String goal) {
    int n = goal.length();
    lps[0] = 0;
    int len = 0;
    int i = 1;
    while (i < n) {
      if (goal.charAt(i) == goal.charAt(len)) {
        len++;
        lps[i] = len;
        i++;
      } else {
        if (len != 0) {
          len = lps[len - 1];
        } else {
          lps[i] = 0;
          i++;
        }
      }
    }
  }

  // Approach 2: Using String Concatenation
  // Time Complexity: O(n)
  // Space Complexity: O(n)
  // This approach is less efficient than KMP but simpler to implement.
  public boolean rotateStringConcat(String s, String goal) {
    if (s.length() != goal.length()) {
      return false;
    }
    String concatenated = s + s;
    return concatenated.contains(goal);
  }

}