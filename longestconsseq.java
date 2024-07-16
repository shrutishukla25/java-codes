//LENGTH OF LONGEST CONSECUTIVE SEQUENCE IN AN ARRAY.

import java.util.HashSet;

public class longestconsseq {
    public static void main(String args[]) {
        int arr[] = { 3, 9, 1, 10, 4, 20, 2 };
        int long_leng = 0;

        HashSet<Integer> hs = new HashSet<>();
        for (int no : arr) {
            hs.add(no);
        }
        for (int i = 0; i < arr.length; i++) {
            if (!hs.contains(arr[i] - 1)) {
                int num = arr[i];

                while (hs.contains(num)) {
                    num++;
                }
                if (long_leng < num - arr[i]) {
                    long_leng = num - arr[i];
                }
            }

        }
        System.out.println("LEngth of longest consecutive sequence is: " + long_leng);

    }

}
