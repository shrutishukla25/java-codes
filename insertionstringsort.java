import java.util.Scanner;

public class insertionstringsort {
    public static void insertionstring(String sarr[]) {
        for (int i = 1; i < sarr.length; i++) {
            String temp = sarr[i];
            int j = i;
            while (j > 0 && (sarr[j - 1].compareTo(temp)) > 1) {
                sarr[j] = sarr[j - 1];
                j = j - 1;
            }
            sarr[j] = temp;
        }
        System.out.println("Sorted array is");
        for (int i = 0; i < sarr.length; i++) {
            System.out.print(sarr[i] + " ");
        }
    }

    public static void main(String arsg[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter length of an array");
        int n = sc.nextInt();
        System.out.println("Enter string array elements");
        String sarr[] = new String[n];
        for (int i = 0; i < sarr.length; i++) {
            sarr[i] = sc.next();
        }
        System.out.println();
        insertionstring(sarr);
        sc.close();
    }

}