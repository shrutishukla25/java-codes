public class Binarysearch {
    public static void main(String args[]) {
        int arr[] = { 1, 2, 3, 4, 5, 6, 7, 8 };
        /*
         * Array needs to be sorted while applying binary search and if array is not
         * sorted then we need to sort it out first
         */
        int li = 0;
        int hi = arr.length - 1;
        int mi = (li + hi) / 2;
        int search = 2;

        while (li <= hi) {
            if (arr[mi] == search) {
                System.out.println("item found at index: " + mi + " item is " + arr[mi]);
                break;
                // or else loop will run infinitely.
            }
            if (search > arr[mi]) {
                li = mi + 1;
            } else {
                hi = mi - 1;
            }
            mi = (li + hi) / 2;
        }
        if (li > hi) {
            System.out.println("Item not found");
        }
    }
}
