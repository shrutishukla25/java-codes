// Rat Count House
public class acc1 {
    public static void main(String[] args) {
        int r = 7;
        int unit = 2;
        int req = r * unit;
        int arr[] = { 2, 8, 3, 5, 7, 4, 1, 2 };
        int result = 0;
        int sum = 0;
        if (arr.length == 0) {
            result = -1;
        }
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
            if (sum >= req) {
                // checking condition for 14 cause 7*2=14 food is required for 7 rats
                result = i + 1;
                break;
            }
        }
        if (sum < req) {
            // means not enough food
            result = 0;
        }
        System.out.println(result);
    }
}