import java.util.*;

class slidingwindowmin {
    public static String minWindow(String s, String t) {
        HashMap<Character, Integer> map = new HashMap<>();
        int i = 0, j = 0;
        int start = 0;
        int minlen = Integer.MAX_VALUE;
        for (char c : t.toCharArray()) {
            map.put(c, map.getOrDefault(c, 0) + 1);
        }
        int count = t.length();
        while (j < s.length()) {
            char a = s.charAt(j);
            if (map.containsKey(a)) {
                if (map.get(a) > 0) {
                    count--;
                }
                map.put(a, map.getOrDefault(a, 0) - 1);

            } else {
                map.put(a, map.getOrDefault(a, 0) - 1);
            }
            while (count == 0) {
                if (minlen > j - i + 1) {
                    minlen = j - i + 1;
                    start = i;
                }
                char b = s.charAt(i);
                map.put(b, map.getOrDefault(b, 0) + 1);
                if (map.get(b) > 0) {
                    count++;
                }
                i++;
            }

            j++;
        }

        return s.substring(start, start + minlen);
        // Here it will return s.substring(9,13)
        // which will print BANC from 9to12 i.e. one index before 13

    }

    public static void main(String[] args) {
        String s = "ADOBECODEBANC";
        String t = "ABC";
        System.out.print(minWindow(s, t));
    }
}