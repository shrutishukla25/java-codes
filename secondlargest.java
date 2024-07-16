public class secondlargest {
    public static void main(String args[]) {
        int arr[] = { 10, 12, 11, 6, 3, 2 };
        int largest = Integer.MIN_VALUE;
        int sec_largest = Integer.MIN_VALUE;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > largest) {
                sec_largest = largest;
                largest = arr[i];
            } else if (arr[i] > sec_largest && arr[i] != largest) {
                sec_largest = arr[i];
            }
        }
        System.out.println("second largest element is " + sec_largest);

    }
}
