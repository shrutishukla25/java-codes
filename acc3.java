public class acc3 {
    public static void main(String args[]) {
        String str = "a987 abC012";

        int n = str.length();
        System.out.println(CheckPassword(str, n));
    }

    public static int CheckPassword(String str, int n) {
        if (n < 4) {
            return 0;
        }
        if (str.charAt(0) >= '0' && str.charAt(0) <= '9') {
            return 0;
        }
        int num = 0, cap = 0;
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == ' ' || str.charAt(i) == '/') {
                return 0;
                // String => " " , Character=>' '
            }
            if (str.charAt(i) >= 'A' && str.charAt(i) <= 'Z') {
                cap++;
            }
            if (str.charAt(i) >= '0' && str.charAt(i) <= '9') {
                num++;
            }
        }
        if (num > 0 && cap > 0) {
            return 1;
        }
        return 0;
    }

}
