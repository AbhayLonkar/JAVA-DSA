// 75. Sort Colors

public class ID75 {
  public static void main(String args[]) {
    ID75 obj = new ID75();
    int[] arr = { 2, 0, 2, 1, 1, 0 };
    obj.sortColors(arr);
    for (int x : arr) {
      System.out.print(x + " ");
    }
    // Output: 0 0 1 1 2 2
  }

  public void sortColors(int[] arr) {
    int c0 = 0;
    int c1 = 0;
    int c2 = 0;
    for (int x : arr) {
      if (x == 0)
        c0++;
      else if (x == 1)
        c1++;
      else
        c2++;
    }
    int i = 0;
    while (i < c0) {
      arr[i] = 0;
      i++;
    }
    while (i < c0 + c1) {
      arr[i] = 1;
      i++;
    }
    while (i < c0 + c1 + c2) {
      arr[i] = 2;
      i++;
    }
  }
}