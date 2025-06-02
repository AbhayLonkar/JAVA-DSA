// 3. Longest Substring Without Repeating Characters
public class ID3 {

  public static void main(String[] args) {
    String s = "abcabcbb"; // Example input
    System.out.println(lengthOfLongestSubstring(s)); // Output: 3
  }

  static int lengthOfLongestSubstring(String s) {
    int len = s.length();
    if (len == 0)
      return 0;
    if (len == 1)
      return 1;

    int max = 0;
    for (int i = 0; i < len; i++) {
      int currMax = 0;
      String dup = "";
      for (int j = i; j < len; j++) {
        if (dup.contains("" + s.charAt(j)))
          break;
        else {
          dup += s.charAt(j);
          currMax++;
        }
      }
      max = Math.max(max, currMax);
    }
    return max;
  }
}
