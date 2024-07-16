public class missingnuminarr {

    public static void main(String args[]) {
        int arr[] = { 1, 2, 3, 5, 6 };// missingnum=4
        int xor1 = arr[0];
        for (int i = 1; i < arr.length; i++) {
            xor1 = xor1 ^ arr[i];
        }
        int xor2 = 1;
        for (int i = 2; i <= 6; i++) {
            xor2 = xor2 ^ i;

        }
        System.out.println("missing element is: " + (xor2 ^ xor1));
    }
    /*
     * public static void main(String args[]) {
     * int arr[] = { 1, 2, 3, 5, 6 };// missingnum=4
     * int sum = 0;
     * int expected_n = arr.length + 1;
     * int total_sum = expected_n * (expected_n + 1) / 2;
     * for (int no : arr) {
     * sum += no;
     * }
     * System.out.println("Missing element is:" + (total_sum - sum));
     * }
     */
}
