import java.util.Scanner;

public class primenum {
    // using recursion.
    public static boolean isprimenumber(int num, int f) {
        if (num == f) {
            return true;
        }
        if (num % f == 0) {
            return false;
        } else {
            return isprimenumber(num, f + 1);
        }
    }

    public static void main(String args[]) {
        Scanner s = new Scanner(System.in);
        int num = s.nextInt();
        int f = 2;
        System.out.println(isprimenumber(num, f));
        s.close();
    }
}
