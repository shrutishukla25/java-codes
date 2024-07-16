import java.util.Scanner;
import static java.lang.Math.abs;

public class acc5 {
    public static int diffofSum(int n, int m) {
        int sum1 = 0, sum2 = 0;
        for (int i = 0; i <= m; i++) {
            if (i % n != 0) {
                sum1 += i;
            } else {
                sum2 += i;
            }
        }
        return abs(sum1 - sum2);
        // remember abs

    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        System.out.println(diffofSum(n, m));
        sc.close();
    }

}
