import java.util.Set;
import java.util.HashSet;

public class set {
    public static void main(String args[]) {
        Set<Integer> nums = new HashSet<Integer>();
        // we can use TreeSet in place of hashset if we want output in form of sorted
        // array eg. Set<Integer> nums = new TreeSet<Integer>();
        nums.add(92);
        nums.add(81);
        nums.add(3);
        System.out.println(nums);
        // Set does not provide value in a sorted form
        // Set does not provide index value of number as there is not get method in set.
        // set provide unique values
    }
}
