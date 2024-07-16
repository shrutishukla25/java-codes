public class quiicksort {
  // Quick sort

  public static void quicksort(int arr[], int li, int hi) {
    if (li < hi) {
      int pidx = partition(arr, li, hi);
      quicksort(arr, li, pidx - 1);
      quicksort(arr, pidx + 1, hi);
    }
  }

  public static int partition(int arr[], int li, int hi) {
    int pivot = arr[hi];
    int i = li - 1;
    for (int j = li; j < hi; j++) {
      if (arr[j] < pivot) {
        i++;
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;

      }
    }
    i++;
    int temp = arr[i];
    arr[i] = pivot;
    arr[hi] = temp;
    return i;
  }

  public static void main(String args[]) {
    int arr[] = { 4, 6, 2, 5, 7, 9, 1, 3 };
    int n = arr.length;
    quicksort(arr, 0, n - 1);
    // PRINT ARRAY;
    System.out.println("Sorted array using quick sort is:");
    for (int i = 0; i < arr.length; i++) {
      System.out.print(arr[i] + " ");
    }
  }

}
