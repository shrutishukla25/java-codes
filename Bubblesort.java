public class Bubblesort {
    public static void main(String args[]) {
        // Best Case time Complexity= Omega(N);
        // Worst average case= O(N^2) and theta(N^2);
        // space complexity=O(1);
        int arr[] = { 8, 3, 4, 5, 6, 7 };
        for (int i = 0; i < arr.length - 1; i++) {
            int flag = 0;
            for (int j = 0; j < arr.length - 1 - i; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                    flag = 1;
                }
            }
            if (flag == 0) {
                break;
            }

        }
        System.out.print("Sorted array is ");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

}
