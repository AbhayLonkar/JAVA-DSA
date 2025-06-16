// 67. Add Binary

public class ID67 {
  public static void main(String[] args) {
    ID67 solution = new ID67();
    String s1 = "11";
    String s2 = "1";
    System.out.println(solution.addBinary(s1, s2)); // Output: 100
  }

  public String addBinary(String s1, String s2) {
    s1 = stripLeadingZero(s1);
    s2 = stripLeadingZero(s2);
    if (s1.isEmpty())
      s1 = "0";
    if (s2.isEmpty())
      s2 = "0";
    StringBuilder res = new StringBuilder("");
    int n = s1.length();
    int m = s2.length();
    if (n < m) {
      String temp = s1;
      s1 = s2;
      s2 = temp;
      int temp2 = n;
      n = m;
      m = temp2;
    }
    int j = m - 1;
    int carry = 0;
    for (int i = n - 1; i >= 0; i--) {
      int n1 = s1.charAt(i) - '0';
      int sum = n1 + carry;
      if (j >= 0) {
        int n2 = s2.charAt(j) - '0';
        sum += n2;
        j--;
      }
      int bit = sum % 2;
      carry = sum / 2;
      res.append(bit);
    }
    if (carry > 0) {
      res.append("1");
    }
    return res.reverse().toString();
  }

  public String stripLeadingZero(String s) {
    int n = 0;
    int len = s.length();
    while (n < len && s.charAt(n) == '0') {
      n++;
    }
    return s.substring(n, len);
  }

}