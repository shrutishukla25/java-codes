import java.util.List;
import java.util.ArrayList;

public class list {
    public static void main(String args[]) {
        List<Integer> nums = new ArrayList<Integer>();
        nums.add(6);
        nums.add(7);
        nums.add(8);

        nums.remove(2);
        System.out.println(nums.get(0));// provide index value.
        System.out.println(nums);

    }
}
