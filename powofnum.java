import java.util.Scanner;

public class powofnum {
    // using recursion
    static double powofnumber(int base, int exp) {
        if (exp == 0) {
            return 1; // base condition
        }
        if (exp > 0) {
            return base * powofnumber(base, exp - 1);
        } else {
            return 1 / powofnumber(base, -exp);
        }

    }

    public static void main(String args[]) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter number and it power");
        int base = s.nextInt();
        int exp = s.nextInt();
        System.out.println(powofnumber(base, exp));
        s.close();
    }
}
