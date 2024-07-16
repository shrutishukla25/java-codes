import java.util.*;

public class acc7 {
    public static int productsmallestpair(int n, int arr[], int sum) {
        Arrays.sort(arr);
        if (n < 2) {
            return -1;
        }
        if (arr == null) {
            return 0;
        }
        if ((arr[0] + arr[1]) <= sum) {
            return arr[0] * arr[1];
        } else {
            return 0;
        }

    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int sum = sc.nextInt();
        int n = sc.nextInt();
        int arr[] = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println(productsmallestpair(n, arr, sum));
        sc.close();
    }
}
