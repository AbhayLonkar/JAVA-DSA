import java.util.*;

public class KMP_Algorithm {

  public static void main(String[] args) {
    // Example usage
    KMP_Algorithm kmp = new KMP_Algorithm();
    String text = "abcab";
    String pattern = "ab";
    System.out.println(kmp.search(pattern, text));
  }

  // User function Template for Java
  ArrayList<Integer> search(String pat, String txt) {
    // your code here
    int m = pat.length();
    int n = txt.length();
    int[] lps = new int[m];
    ArrayList<Integer> res = new ArrayList<Integer>();

    constructLps(pat, lps);

    int i = 0, j = 0;

    while (i < n) {
      // If both character matches, moves both pointer forward
      if (pat.charAt(j) == txt.charAt(i)) {
        i++;
        j++;
        if (j == m) {
          res.add(i - j);

          // Use of LPS previous index to skip unnecessary comparisons
          j = lps[j - 1];
        }
      } else {
        if (j != 0) {
          j = lps[j - 1];
        } else {
          i++;
        }
      }
    }
    return res;
  }

  void constructLps(String pat, int[] lps) {
    int len = 0;
    int n = pat.length();

    // LPS[0] will always zero
    lps[0] = 0;

    int i = 1;
    while (i < n) {
      if (pat.charAt(i) == pat.charAt(len)) {
        len++;
        lps[i] = len;
        i++;
      } else {
        if (len != 0) {
          len = lps[len - 1];
        } else {
          lps[i] = 0;
          i++;
        }
      }
    }
  }

}
