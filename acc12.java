import java.util.Scanner;

public class acc12 {
    public static int OperationChoices(int c, int a, int b) {
        int res = 0;
        switch (c) {
            case 1:
                res = a + b;
                break;
            case 2:
                res = a - b;
                break;
            case 3:
                res = a * b;
                break;
            case 4:
                res = a / b;
                break;
        }
        return res;
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int c = sc.nextInt();
        int a = sc.nextInt();
        int b = sc.nextInt();
        System.out.println(OperationChoices(c, a, b));
        sc.close();
    }
}
