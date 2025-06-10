public class ID125 {

  public static void main(String[] args) {
    ID125 solution = new ID125();
    String s = "A man, a plan, a canal: Panama";
    System.out.println(solution.isPalindrome(s)); // Output: true
  }

  public boolean isPalindrome(String s) {
    String s1 = s.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();
    StringBuilder newStr = new StringBuilder(s1).reverse();
    if (newStr.toString().equals(s1))
      return true;
    else
      return false;

  }
}
