// 13. Roman to Integer
public class ID13 {

  public static void main(String[] args) {
    String s = "MCMXCIV";
    System.out.println(romanToInt(s)); // Output: 1994
  }

  static int romanToInt(String s) {
    int num = 0;
    int prev = 0;
    for (int i = s.length() - 1; i >= 0; i--) {
      if (s.charAt(i) == 'M') {
        num += 1000;
        prev = 1000;
      } else if (s.charAt(i) == 'D') {
        num += 500;
        prev = 500;
      } else if (s.charAt(i) == 'C') {
        if (prev <= 100) {
          num += 100;
        } else {
          num -= 100;
        }
        prev = 100;
      } else if (s.charAt(i) == 'L') {
        num += 50;
        prev = 50;
      } else if (s.charAt(i) == 'X') {
        if (prev <= 10) {
          num += 10;
        } else {
          num -= 10;
        }
        prev = 10;
      } else if (s.charAt(i) == 'V') {
        num += 5;
        prev = 5;
      } else if (s.charAt(i) == 'I') {
        if (prev <= 1) {
          num += 1;
        } else {
          num -= 1;
        }
        prev = 1;
      }
    }
    return num;
  }
}
