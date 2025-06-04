// 28. Find the Index of the First Occurrence in a String

class ID28 {

  public static void main(String args[]) {
    String haystack = "sadbutsad";
    String needle = "sad";
    ID28 solution = new ID28();
    System.out.println(solution.strStr(haystack, needle)); // Output: 0
  }

  public int strStr(String haystack, String needle) {
    return haystack.indexOf(needle);
  }
}
