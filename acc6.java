import java.util.ArrayList;
import java.util.*;

public class acc6 {
    public static void main(String[] args) {
        int arr[] = { 3, 2, 1, 7, 5, 4 };
        System.out.println(LargeSmallSum(arr));
        // The ArrayList index starts at 0 just like arrays, but instead of using the
        // square brackets [] to access elements, you use the get(index) to get the
        // value at the index.
    }

    public static int LargeSmallSum(int arr[]) {
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
        return even.get(even.size() - 2) + odd.get(odd.size() - 2);
    }
}
