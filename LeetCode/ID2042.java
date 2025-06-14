// 2042. Check if Numbers Are Ascending in a Sentence
public class ID2042 {
  public static void main(String[] args) {
    ID2042 solution = new ID2042();
    String s = "1 box has 3 blue 4 red 6 green and 12 yellow marbles";
    System.out.println(solution.areNumbersAscending(s)); // Output: true
  }

  public boolean areNumbersAscending(String s) {
    int n = s.length();
    int i = 0;
    int min = Integer.MIN_VALUE;
    while (i < n) {
      int res = Integer.MIN_VALUE;
      while (i < n && Character.isDigit(s.charAt(i))) {
        res = (res * 10) + s.charAt(i) - '0';
        i++;
      }
      i = (i >= n) ? n - 1 : i;
      if (res != Integer.MIN_VALUE) {
        if (res > min) {
          min = res;
        } else {
          return false;
        }
      }
      i++;
    }
    return true;
  }
}
