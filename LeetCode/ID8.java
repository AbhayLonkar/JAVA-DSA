// 8. String to Integer (atoi)

public class ID8 {
  public static void main(String args[]) {
    ID8 solution = new ID8();
    String s = "   -42";
    System.out.println(solution.myAtoi(s));
  }

  public int myAtoi(String s) {
    int i = 0;
    int res = 0;
    int sign = 1;
    int n = s.length();

    while (i < n && s.charAt(i) == ' ') {
      i++;
    }
    if (i == n)
      return 0;
    if (s.charAt(i) == '-') {
      sign = -1;
      i++;
    } else if (s.charAt(i) == '+') {
      i++;
    }
    while (i < n && s.charAt(i) >= '0' && s.charAt(i) <= '9') {
      int num = s.charAt(i) - '0';
      if (res > (Integer.MAX_VALUE - num) / 10) {
        return sign == 1 ? Integer.MAX_VALUE : Integer.MIN_VALUE;
      }
      res = (res * 10) + num;
      i++;
    }
    return (sign * res);
  }
}