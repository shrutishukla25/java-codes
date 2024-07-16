public class linearsearch {
    public static void main(String args[]) {
        int arr[] = { 3, 5, 6, 7, 8 };
        int item = 9, temp = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == item) {
                System.out.println("item found at index " + i + " item is " + arr[i]);
                temp = temp + 1;
                break;
            }
        }
        if (temp == 0) {
            System.out.println("item not found");
        }
    }
}
