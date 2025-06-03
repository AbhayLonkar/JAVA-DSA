// 1298. Maximum Candies You Can Get from Boxes

import java.util.*;

public class ID1298 {

  public static void main(String[] args) {
    int[] status = { 1, 0, 1, 0 };
    int[] candies = { 7, 5, 4, 100 };
    int[][] keys = { {}, {}, { 1 }, {} };
    int[][] containedBoxes = { { 1, 2 }, { 3 }, {}, {} };
    int[] initialBoxes = { 0 };

    ID1298 solution = new ID1298();
    System.out.println(solution.maxCandies(status, candies, keys, containedBoxes, initialBoxes)); // Output: 20
  }

  public int maxCandies(int[] status, int[] candies, int[][] keys, int[][] containedBoxes, int[] initialBoxes) {
    int candiesCollected = 0;
    Set<Integer> visited = new HashSet<>();
    Set<Integer> foundBoxes = new HashSet<>();
    for (int box : initialBoxes) {
      candiesCollected += dfs(box, status, candies, keys, containedBoxes, visited, foundBoxes);
    }
    return candiesCollected;
  }

  int dfs(int box, int[] status, int[] candies, int[][] keys, int[][] containedBoxes, Set<Integer> visited,
      Set<Integer> foundBoxes) {
    if (visited.contains(box)) {
      return 0;
    }
    if (status[box] == 0) {
      foundBoxes.add(box);
      return 0;
    }
    visited.add(box);
    int candiesCollected = candies[box];

    for (int innerBox : containedBoxes[box]) {
      candiesCollected += dfs(innerBox, status, candies, keys, containedBoxes, visited, foundBoxes);
    }

    for (int boxKey : keys[box]) {
      status[boxKey] = 1;
      if (foundBoxes.contains(boxKey)) {
        candiesCollected += dfs(boxKey, status, candies, keys, containedBoxes, visited, foundBoxes);
      }
    }
    return candiesCollected;
  }
}