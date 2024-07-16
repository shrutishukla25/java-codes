import java.util.*;

public class acc15 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter size of an array: ");
        int size = sc.nextInt();
        int arr[] = new int[size];

        for (int i = 0; i < size; i++) {
            System.out.print(" ENTER element at " + i + " index: ");
            arr[i] = sc.nextInt();
        }
        ArrayList<Integer> even = new ArrayList<>();
        ArrayList<Integer> odd = new ArrayList<>();
        for (int i = 0; i < arr.length; i++) {
            if (i % 2 == 0) {
                even.add(arr[i]);
            } else {
                odd.add(arr[i]);
            }
        }
        Collections.sort(even);
        Collections.sort(odd);
        System.out.print("Sorted even array is: ");
        for (int i : even) {
            System.out.print(i + " ");
        }
        System.out.print("Sorted odd array is: ");
        for (int i : odd) {
            System.out.print(i + " ");
        }
        System.out.println();
        System.out.println(even.get(even.size() - 2) + odd.get(odd.size() - 2));
        sc.close();
    }
}
