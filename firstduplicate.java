import java.util.HashSet;

public class firstduplicate {
    public static void main(String args[]) {
        int arr[] = { 2, 2, 1, 4, 1, 4, 5 };
        int temp = -1;
        HashSet<Integer> hs = new HashSet<>();
        for (int i = arr.length - 1; i >= 0; i--) {
            if (hs.contains(arr[i])) {
                temp = i;
            } else {
                hs.add(arr[i]);
            }
        }
        if (temp != -1) {
            System.out.println(
                    "First duplicate element found at index " + temp + " and first duplicate element is " + arr[temp]);
        } else {
            System.out.println("element not found");
        }

    }
    /*
     * // Brute force method
     * public static void main(String args[]) {
     * // Brute force method
     * int arr[] = { 1, 2, 3, 4, 4, 5, 5, 6 };
     * int temp = 0;
     * for (int i = 0; i < arr.length - 1; i++) {
     * for (int j = i + 1; j < arr.length; j++) {
     * if (arr[i] == arr[j] && i != j) {
     * System.out.println("element found at index " + j + " element is " + arr[j]);
     * temp = 1;
     * break;
     * }
     * }
     * if (temp > 0) {
     * break;
     * }
     * }
     * }
     */
}
