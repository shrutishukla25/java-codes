import java.util.Set;
import java.util.Map;
import java.util.HashMap;

public class dupliacteelements {
    // Using Hashmap
    public static void main(String args[]) {
        int arr[] = { 2, 2, 2, 2, 2, 2, 2, 2, 2, 3, 4, 3, 5, 1, 6 };
        Map<Integer, Integer> hm = new HashMap<>();
        for (int no : arr) {
            if (hm.get(no) == null) {
                hm.put(no, 1);
            } else {
                hm.put(no, hm.get(no) + 1);
            }
        }

        Set<Map.Entry<Integer, Integer>> es = hm.entrySet();
        System.out.println("All duplicate elements are");
        System.out.println();
        for (Map.Entry<Integer, Integer> no : es) {
            if (no.getValue() > 1) {
                System.out.print(no.getKey() + " ");
            }

        }

    }
    /*
     * Easy way using map
     * import java.util.*;
     * public class Main
     * {
     * public static void main(String[] args) {
     * int arr[]={1,2,2,3,4,5,5,5};
     * Map<Integer,Integer> mp = new HashMap<>();
     * for(int no:arr){
     * mp.put(no,mp.getOrDefault(no,0)+1);
     * }
     * System.out.print("Duplicate elements are ");
     * for(Map.Entry<Integer,Integer> e:mp.entrySet()){
     * 
     * if(e.getValue()>1){
     * System.out.print(e.getKey()+" ");
     * }
     * }
     * System.out.println();
     * for(int k:mp.keySet()){
     * System.out.print(k+" ");
     * }
     * System.out.println();
     * for(int v:mp.values()){
     * System.out.print(v+" ");
     * }
     * }
     * }
     */

    /*
     * // Using set
     * public static void main(String args[]) {
     * int arr[] = { 2, 2, 2, 3, 4, 3, 5, 1, 6 };
     * Set<Integer> s = new HashSet<>();
     * System.out.println("Duplicate elements using set are");
     * for (int no : arr) {
     * if (s.add(no) == false) {
     * System.out.print(no + " ");
     * }
     * }
     * 
     * }
     */
    /*
     * // Brute force method
     * public static void main(String[] args) {
     * int arr[] = { 2, 2, 2, 3, 4, 3, 5, 1, 6 };
     * for (int i = 0; i < arr.length; i++) {
     * for (int j = i + 1; j < arr.length; j++) {
     * if (arr[i] == arr[j] && i != j) {
     * System.out.print(arr[j] + " ");
     * }
     * }
     * }
     */

}
