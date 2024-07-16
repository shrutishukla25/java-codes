//kadane's algorihtm 
/*finding sum of max subarray in an array of +ve and -ve integers*/
public class Kadanealgo {
    public static void main(String args[]) {
        int arr[] = { 4, -2, -3, 4, -1, -2, 1, 5, -3 };
        int start = 0, end = 0, s = 0;
        int max_ending_here = 0;
        int max_so_far = Integer.MIN_VALUE;
        for (int i = 0; i < arr.length; i++) {
            max_ending_here += arr[i];
            if (max_so_far < max_ending_here) {
                max_so_far = max_ending_here;
                start = s;
                end = i;
            }
            if (max_ending_here < 0) {
                max_ending_here = 0;
                s = i + 1;
            }

        }

        System.out.println(
                "Sum of Maximum subarray is: " + max_so_far + " which starts at index " + start + " and ends at "
                        + end);
        System.out.println("Maximum Subarray is");
        for (int i = start; i <= end; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
