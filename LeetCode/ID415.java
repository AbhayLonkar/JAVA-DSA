// 415. Add Strings

public class ID415 {
  public static void main(String[] args) {
    ID415 solution = new ID415();
    String num1 = "123";
    String num2 = "11";
    System.out.println(solution.addStrings(num1, num2)); // Output: 134
  }

  public String addStrings(String num1, String num2) {
    int i = num1.length() - 1, j = num2.length() - 1;
    int carry = 0;
    StringBuilder result = new StringBuilder();

    while (i >= 0 || j >= 0 || carry != 0) {
      int digit1 = i >= 0 ? num1.charAt(i) - '0' : 0;
      int digit2 = j >= 0 ? num2.charAt(j) - '0' : 0;

      int total = digit1 + digit2 + carry;
      carry = total / 10;

      result.append(total % 10);

      i--;
      j--;
    }

    return result.reverse().toString();
  }
}