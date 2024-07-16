public class commonsubsequence {
    public static boolean isSubsequence(String s1, String s2) {
        if (s1.length() == 0) {
            return true;
        }
        int i = 0;
        int j = 0;
        while (i < s1.length() && j < s2.length()) {
            if (s1.charAt(i) == s2.charAt(j)) {
                i++;
            }
            if (s1.length() == i) {
                return true;
            }
            j++;
        }
        return false;
    }

    public static void main(String args[]) {
        String s1 = "FLaw";
        String s2 = "lowFLaw";
        /*
         * here flaw is a common subsequence; or ade is common subsequence in abcdefgh
         */
        System.out.println(isSubsequence(s1, s2));
    }

}
