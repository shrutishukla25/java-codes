/* Count Elements With Maximum Frequency
Example 1:

Input: nums = [1,2,2,3,1,4]
Output: 4
Explanation: The elements 1 and 2 have a frequency of 2 which is the maximum frequency in the array.
So the number of elements in the array with maximum frequency is 4.
 */

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class maxfreq {

    public static int maxFrequencyElements(int[] nums) {
        int freq = 0;
        int c = 0;
        int count;
        Map<Integer, Integer> mp = new HashMap<>();
        for (int no : nums) {

            if (mp.get(no) == null) {
                mp.put(no, 1);
            } else {
                count = mp.get(no) + 1;
                mp.put(no, count);
            }
        }
        Set<Map.Entry<Integer, Integer>> es = mp.entrySet();
        for (Map.Entry<Integer, Integer> n : es) {
            if (n.getValue() > freq) {
                freq = n.getValue();
            }
        }
        for (Map.Entry<Integer, Integer> n : es) {
            if (n.getValue() == freq) {
                c += n.getValue();
            }
        }

        return c;
    }

    public static void main(String args[]) {
        int nums[] = { 1, 2, 2, 2, 2, 2, 3, 1, 4 };
        System.out.println(maxFrequencyElements(nums));
    }
}
