import java.util.Scanner;

public class selectionstringsort {
    public static void selectionstring(String sarr[]) {
        for (int i = 0; i < sarr.length - 1; i++) {
            int min = i;
            for (int j = i + 1; j < sarr.length; j++) {
                if (sarr[min].compareTo(sarr[j]) > 0) {
                    min = j;
                }
            }
            String temp = sarr[i];
            sarr[i] = sarr[min];
            sarr[min] = temp;
        }
        System.out.println("Sorted array is");
        for (int i = 0; i < sarr.length; i++) {
            System.out.print(sarr[i] + " ");
        }
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter length of an array");
        int n = sc.nextInt();
        System.out.println("Enter elements in an array");
        String sarr[] = new String[n];
        for (int i = 0; i < sarr.length; i++) {
            sarr[i] = sc.next();
        }
        System.out.println();
        selectionstring(sarr);
        sc.close();
    }

}
