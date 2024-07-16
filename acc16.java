import java.util.Scanner;

//TABLE PRINT
public class acc16 {
    public static void PrintTable(int num) {
        int res, sum = 0;
        for (int i = 1; i <= 10; i++) {
            res = num * i;
            System.out.print(res + " ");
            sum += res;
        }
        System.out.println();
        System.out.print(sum);
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();

        PrintTable(num);
        sc.close();

    }
}
