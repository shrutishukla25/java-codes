//import java.util.*;(for arrays.sort method)

public class maxorminarrval {
    public static void main(String args[]) {
        int arr[] = { 5, 6, 9, 3, 2, 5, 10, 6 };
        int min = arr[0];
        int max = arr[arr.length - 1];
        /*
         * Arrays.sort(arr);
         * System.out.println("Max value is " + arr[arr.length - 1] + " min value is " +
         * arr[0]);
         */
        for (int i = 1; i < arr.length; i++) {
            if (min > arr[i]) {
                min = arr[i];
            }
        }
        System.out.println("min value is " + min);
        for (int i = 1; i < arr.length - 1; i++) {
            if (max < arr[i]) {
                max = arr[i];
            }
        }
        System.out.println("max value is " + max);
    }
}
