public class onlyonceinarr {
    // Find a element that appear only once in array where every other element
    // appears twice.
    public static void main(String args[]) {
        int arr[] = { 1, 1, 2, 2, 3, 4, 4 };
        int res = arr[0];
        for (int i = 1; i < arr.length; i++) {
            res = res ^ arr[i];
        }
        System.out.println("element is " + res);
    }

}
