import java.util.HashSet;

public class commonelementsinarr {
    // FIND COMMON ELEMENTS IN TWO ARRAYS
    public static void main(String args[]) {
        int arr1[] = { 4, 3, 7, 9, 2, 4 };
        int arr2[] = { 5, 1, 4, 8, 3, 5 };

        HashSet<Integer> hs1 = new HashSet<>();
        HashSet<Integer> hs2 = new HashSet<>();
        for (int no : arr1) {
            hs1.add(no);
            // hs1=[4,3,7,9,2]{duplicacy removed}
        }
        for (int no : arr2) {
            hs2.add(no);
            // hs2=[5,1,4,8,3]{duplicacy removed}
        }
        System.out.println("common elements in both arrays are");
        for (int no : hs2) {
            boolean b = hs1.add(no);
            if (b == false) {
                System.out.print(no + " ");
            }
        }

    }
}
/*
 * public static void main(String args[]) {
 * int arr1[] = { 4, 3, 7, 9, 2, 4 };
 * int arr2[] = { 5, 1, 4, 8, 3, 5 };
 * HashSet<Integer> hs = new HashSet<>();
 * for (int no : arr1) {
 * hs.add(no);
 * }
 * System.out.println("Common elements are");
 * for (int no : arr2) {
 * boolean b = hs.add(no);
 * if (b == false) {
 * System.out.print(no + " ");
 * }
 * }
 * }
 */