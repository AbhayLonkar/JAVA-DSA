
// 989. Add to Array-Form of Integer
import java.util.*;

public class ID989 {

  public static void main(String[] args) {
    ID989 solution = new ID989();
    int[] num = { 1, 2, 0, 0 };
    int k = 34;
    System.out.println(solution.addToArrayForm(num, k)); // Output: [1, 2, 3, 4]
  }

  public List<Integer> addToArrayForm(int[] num, int k) {
    List<Integer> res = new ArrayList<Integer>();
    int carry = 0;
    for (int i = num.length - 1; i >= 0; i--) {
      int sum = num[i] + carry;
      if (k > 0) {
        sum += k % 10;
        k /= 10;
      }
      carry = sum / 10;
      res.add(sum % 10);
    }
    while (k > 0) {
      int sum = (k % 10) + carry;
      carry = sum / 10;
      res.add(sum % 10);
      k /= 10;
    }
    if (carry > 0) {
      res.add(carry);
    }
    Collections.reverse(res);
    return res;
  }
}