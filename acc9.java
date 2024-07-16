import java.util.Scanner;

public class acc9 {
    public static String MoveHyphen(String s, int n) {
        String res = "";
        if (s == null) {
            return null;
        }
        for (int i = 0; i < n; i++) {
            if (s.charAt(i) == '_') {
                res = s.charAt(i) + res;
            } else {
                res = res + s.charAt(i);
            }
        }
        return res;
    }

    public static void main(String args[]) {
        Scanner s = new Scanner(System.in);
        System.out.println("enter any string");
        String str = s.next();
        System.out.println(MoveHyphen(str, str.length()));
        s.close();
    }

}
