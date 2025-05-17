public class PalindromeNumber {
    public static void main(String[] args) {
        int num = 5;
        System.out.println("Number is: " + num);
        boolean result = isPalindrome(num);
        if (result) {
            System.out.println("Number is palindrome");
        } else {
            System.out.println("Number is not palindrome");
        }
    }


    private static boolean isPalindrome(int num) {
        if (num<0) {
            return false;
        }
        int og,rev=0,rem;
        og = num;
        while (og > 0) {
            rem = og % 10;
            rev = (rev * 10) + rem;
            og /= 10;
        }
        return num == rev;
    }
}
