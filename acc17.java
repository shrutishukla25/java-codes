import java.util.Scanner;

public class acc17 {
    public static void PrintAllPalindrome(int n1, int n2) {
        for (int i = n1; i <= n2; i++) {
            int store = i;
            int rev = 0;
            while (store != 0) {
                int rem = store % 10;
                rev = rev * 10 + rem;
                store = store / 10;
            }
            if (rev == i) {
                System.out.print(i + " ");
            }
        }
    }

    public static void main(String rags[]) {
        Scanner sc = new Scanner(System.in);
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();
        PrintAllPalindrome(num1, num2);
        sc.close();

    }
}
