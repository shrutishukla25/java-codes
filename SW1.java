//Find max sum of subarray with size 3

import java.lang.Math;

public class SW1 {
    public static void main(String args[]) {
        int arr[] = { -2, -3, 4, -1, -2, 1, 5, -3 };
        int i = 0, j = 0, k = 3;
        int sum = 0, max_sum = Integer.MIN_VALUE;
        while (j < arr.length) {
            sum += arr[j];
            if (j - i + 1 < k) {
                j++;
            } else if (j - i + 1 == k) {
                max_sum = Math.max(max_sum, sum);
                sum = sum - arr[i];
                i++;
                j++;
            }
        }
        System.out.println("MAXIMUM SUM OF SUBARRAY OF SIZE 3 USING SLIDING WINDOW IS:" + max_sum);
    }
}
