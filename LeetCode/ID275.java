// 275. H-Index II

public class ID275 {
  public static void main(String[] args) {
    ID275 solution = new ID275();
    int[] citations = { 0, 1, 3, 5, 6 };
    System.out.println("H-Index: " + solution.hIndex(citations)); // Output: 3
  }

  public int hIndex(int[] citations) {
    int start = 0;
    int end = citations.length - 1;
    while (start <= end) {
      int mid = start + (end - start) / 2;
      if (citations[mid] == citations.length - mid) {
        return citations[mid];
      } else if (citations[mid] < citations.length - mid) {
        start = mid + 1;
      } else {
        end = mid - 1;
      }
    }
    return citations.length - start;
  }
}