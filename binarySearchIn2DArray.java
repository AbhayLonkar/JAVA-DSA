import java.util.Arrays;

public class binarySearchIn2DArray {
  public static void main(String args[]) {
    int[][] matrix = {
        { 11, 12, 13, 14 },
        { 15, 16, 17, 18 },
        { 19, 20, 21, 22 },
        { 23, 24, 25, 26 }
    };
    System.out.println(Arrays.toString(search(matrix, 21)));
  }

  static int[] search(int[][] matrix, int target) {
    int r = 0;
    int c = matrix.length - 1;
    while (r < matrix.length && c > 0) {
      if (target == matrix[r][c]) {
        return new int[] { r, c };
      }
      if (target > matrix[r][c]) {
        r++;
      } else {
        c--;
      }
    }

    return (new int[] { -1, -1 });
  }
}
