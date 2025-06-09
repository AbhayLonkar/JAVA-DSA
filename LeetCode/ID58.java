// 58. Length of Last Word

public class ID58 {
  public static void main(String args[]) {
    ID58 solution = new ID58();
    String s = "Hello World";
    System.out.println(solution.lengthOfLastWord(s)); // Output: 5
    s = "   fly me   to   the moon  ";
    System.out.println(solution.lengthOfLastWord(s)); // Output: 4
    s = "luffy is still joyboy";
    System.out.println(solution.lengthOfLastWord(s)); // Output: 6
  }

  public int lengthOfLastWord(String s) {
    int count = 0;
    s = s.trim();
    int n = s.length();
    for (int i = n - 1; i >= 0; i--) {
      if (s.charAt(i) == ' ')
        break;
      else
        count++;
    }
    return count;
  }
}