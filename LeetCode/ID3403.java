// 3403. Find the Lexicographically Largest String From the Box

class ID3403 {
  public static void main(String[] args) {
    ID3403 solution = new ID3403();
    String word = "dcba";
    int numFriends = 2;
    System.out.println(solution.answerString(word, numFriends)); // Output: "aba"
  }

  public String answerString(String word, int numFriends) {
    if (word.length() == 1) {
      return word;
    }
    if (numFriends == 1) {
      return word;
    }
    int len = word.length();
    int maxLength = len - (numFriends - 1);
    String curr = "";
    for (int i = 0; i < len; i++) {
      int possibleLastIndex = Math.min(maxLength, len - i);
      curr = max(curr, word.substring(i, i + possibleLastIndex));
    }
    return curr;
  }

  String max(String s1, String s2) {
    if (s1.compareTo(s2) > 0) {
      return s1;
    } else {
      return s2;
    }
  }
}
