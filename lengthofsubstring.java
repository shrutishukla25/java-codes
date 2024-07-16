//Calculate length of longest Substring without repeating characters.
//Sliding Window Concept is going to be used.

import java.util.HashMap;
import java.lang.Math;

public class lengthofsubstring {
    static int length(String s) {
        // USING MAP
        if (s.length() == 0) {
            return 0;
        }
        HashMap<Character, Integer> mp = new HashMap<>();
        int l = 0, r = 0, max_ans = 0;
        while (r < s.length()) {
            if (mp.containsKey(s.charAt(r))) {
                l = Math.max(mp.get(s.charAt(r)) + 1, l);
            }
            mp.put(s.charAt(r), r);
            max_ans = Math.max(max_ans, r - l + 1);
            r++;
        }
        return max_ans;
    }

    public static void main(String args[]) {
        String s = "pwwkew";
        System.out.println("length of longest substring is " + length(s));
    }
}
