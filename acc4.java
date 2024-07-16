import java.util.*;
import static java.lang.Math.abs;

public class acc4 {

    public static int findCount(int n, int arr[], int num, int diff) {
        int count = 0;
        for (int i = 0; i < n; i++) {
            if (abs(arr[i] - num) <= diff) {
                // This function returns the absolute value of the argument, effectively
                // eliminating any negative sign.
                count++;
            }
        }
        if (count > 0) {
            return count;
        } else {
            return -1;
        }
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter no of elements:");
        int n = sc.nextInt();
        System.out.println("Enter elements:");
        int arr[] = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println("Enter num:");
        int num = sc.nextInt();
        System.out.println("Enter diff:");
        int diff = sc.nextInt();
        System.out.println(findCount(n, arr, num, diff));
        sc.close();
    }
}
