// 274. H-Index
public class ID274 {
  public static void main(String args[]) {
    ID274 solution = new ID274();
    int[] citations = { 3, 0, 6, 1, 5 };
    System.out.println("H-Index: " + solution.hIndex(citations)); // Output: 3
  }

  public int hIndex(int[] citations) {
    int n = citations.length;
    int[] freq = new int[n + 1];

    for (int i = 0; i < n; i++) {
      if (citations[i] >= n) {
        freq[n]++;
      } else {
        freq[citations[i]]++;
      }
    }
    int idx = n;
    int count = freq[n];
    while (count < idx) {
      idx--;
      count += freq[idx];
    }
    return idx;
  }
}