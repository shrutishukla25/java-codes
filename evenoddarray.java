import java.util.ArrayList;

public class evenoddarray {
    /*
     * print number of even and odd elements in an array , their sum and count them
     */
    public static void main(String args[]) {
        int arr[] = { 8, 5, 10, 12, 3, 1, 4 };
        ArrayList<Integer> al1 = new ArrayList<>();
        ArrayList<Integer> al2 = new ArrayList<>();
        int total_1 = 0, total_2 = 0;

        for (int no : arr) {
            if (no % 2 == 0) {
                al1.add(no);
            } else {
                al2.add(no);
            }
        }
        System.out.print("\nEven numbers in array are:\n");
        for (int no : al1) {
            System.out.print(no + " ");
            total_1 += no;
        }
        System.out.println("\n");
        System.out.println("Count of even numbers:" + al1.size());
        System.out.println("Sum of even numbers:" + total_1);

        System.out.print("\nOdd numbers in array are:\n");
        for (int no : al2) {
            System.out.print(no + " ");
            total_2 += no;
        }
        System.out.println("\n");
        System.out.println("Count of odd numbers:" + al2.size());
        System.out.println("Sum of odd numbers:" + total_2);
    }
}
