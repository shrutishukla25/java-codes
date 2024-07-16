import java.util.Scanner;

public class acc11 {
    public static void ReplaceChar(String s, int n, char ch1, char ch2) {
        String res = "";
        for (int i = 0; i < n; i++) {
            if (s.charAt(i) == ch1) {
                res += ch2;
            } else if (s.charAt(i) == ch2) {
                res += ch1;
            } else {
                res += s.charAt(i);
            }
        }
        System.out.println(res);
    }

    public static void main(String args[]) {
        Scanner s = new Scanner(System.in);
        char ch1 = s.next().charAt(0);
        char ch2 = s.next().charAt(0);
        String str = s.next();
        // System.out.println(ReplaceChar(str, str.length(), ch1, ch2));
        // we are calling method that has return type void so we will call it directly.
        ReplaceChar(str, str.length(), ch1, ch2);
        s.close();
    }
}
