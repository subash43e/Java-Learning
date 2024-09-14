public class Main {

  public static void main(String[] args) {
    int[] array = { 8, 2, 5, 3, 4, 7, 6, 1 };
    mergeSort(array);
    for (int i = 0; i < array.length; i++) {
      System.out.print(array[i] + " ");
    }
  }

  private static void mergeSort(int[] array) {
    int length = array.length;
    if (length <= 1)
      return; // base case

    int middle = length / 2;
    int[] leftArray = new int[middle];
    int[] rightArray = new int[length - middle];

    // Divide the array into two halves
    for (int i = 0; i < length; i++) {
      if (i < middle) {
        leftArray[i] = array[i];
      } else {
        rightArray[i - middle] = array[i];
      }
    }

    mergeSort(leftArray);
    mergeSort(rightArray);
    merge(leftArray, rightArray, array);
  }

  private static void merge(int[] leftArray, int[] rightArray, int[] array) {
    int i = 0, l = 0, r = 0; // indices

    // Merge the sorted arrays
    while (l < leftArray.length && r < rightArray.length) {
      if (leftArray[l] <= rightArray[r]) {
        array[i++] = leftArray[l++];
      } else {
        array[i++] = rightArray[r++];
      }
    }

    // Copy any remaining elements from the left or right arrays
    while (l < leftArray.length) {
      array[i++] = leftArray[l++];
    }
    while (r < rightArray.length) {
      array[i++] = rightArray[r++];
    }
  }
}
