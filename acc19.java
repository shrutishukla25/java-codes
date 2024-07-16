import java.util.Scanner;

public class acc19 {
    public static void MaxInArray(int arr[], int n) {
        int max = 0, index = 0;
        for (int i = 0; i < n; i++) {

            if (arr[i] > max) {
                max = arr[i];
                index = i;
            }

        }
        System.out.println(max);
        System.out.println(index);

    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        MaxInArray(arr, n);
        sc.close();
    }
}
