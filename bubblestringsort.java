import java.util.Scanner;

public class bubblestringsort {
    public static void sortedstring(String sarr[]) {

        for (int i = 0; i < sarr.length - 1; i++) {
            for (int j = 0; j < sarr.length - 1 - i; j++) {
                if (sarr[j].compareTo(sarr[j + 1]) > 0) {
                    String temp = sarr[j];
                    sarr[j] = sarr[j + 1];
                    sarr[j + 1] = temp;
                }
            }

        }
        System.out.println("sorted array in string is");
        for (int i = 0; i < sarr.length; i++) {
            System.out.print(sarr[i] + " ");
        }

    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter length of your array");
        int n = sc.nextInt();
        System.out.println("Enter elements");
        String sarr[] = new String[n];
        for (int i = 0; i < n; i++) {
            sarr[i] = sc.next();
        }
        sortedstring(sarr);
        sc.close();
    }
}
