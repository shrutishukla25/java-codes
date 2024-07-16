public class mergesort {
    /*
     * Time complexity: O(nlogn)
     * Reason: At each step, we divide the whole array, for that logn and we assume
     * n steps are taken to get a sorted array, so overall time complexity will be
     * nlogn
     * Space complexity: O(n)
     * Reason: We are using a temporary array to store elements in sorted order.
     */
    public static void conquer(int arr[], int l, int mid, int h) {
        int merged[] = new int[h - l + 1];
        int idx1 = l, idx2 = mid + 1, x = 0;
        while (idx1 <= mid && idx2 <= h) {
            if (arr[idx1] <= arr[idx2]) {
                merged[x++] = arr[idx1++];
            } else {
                merged[x++] = arr[idx2++];
            }
        }
        while (idx1 <= mid) {
            merged[x++] = arr[idx1++];
        }
        while (idx2 <= h) {
            merged[x++] = arr[idx2++];
        }

        for (int i = 0, j = l; i < merged.length; i++, j++) {
            arr[j] = merged[i];
        }

    }

    public static void divide(int arr[], int l, int h) {
        if (l >= h) {
            return;
        }
        int mid = l + (h - l) / 2;
        divide(arr, l, mid);
        divide(arr, mid + 1, h);
        conquer(arr, l, mid, h);

    }

    public static void main(String args[]) {
        int arr[] = { 0, 1, 2, 0, 1, 2, 1, 2, 0, 0, 0, 1 };
        int n = arr.length;

        divide(arr, 0, n - 1);

        // Print array
        System.out.println("Sorted array is");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
