/**
 * Main
 */
public class Main {

  public static void main(String[] args) {
    int[] arr = { 2, 3, 6, 8, 9, 13, 20 };

    System.out.println(binarySearch(arr, 7));
  }

  private static int binarySearch(int[] array, int target) {

    int low = 0;

    int high = array.length - 1;

    while (low <= high) {

      int middle = low + (high - low) / 2;

      int value = array[middle];

      if (value < target) {

        low = middle + 1; // move the low pointer to the right half

      } else if (value > target) {

        high = middle - 1; // move the high pointer to the left half

      } else {

        return middle; // target found

      }

    }

    return -1; // target not found

  }

}
