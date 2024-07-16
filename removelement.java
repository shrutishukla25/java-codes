public class removelement {
    public static void main(String args[]) {
        int arr[] = { 10, 40, 30, 80, 60, 20 };
        // Remove/delete 30
        int remove = 30, count = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == remove) {
                for (int j = i; j < arr.length - 1; j++) {
                    arr[j] = arr[j + 1];
                    count = 1;
                }
                break;
            }
        }
        if (count == 0) {
            System.out.println("element not found");
        } else {
            for (int no : arr) {
                System.out.print(no + " ");
            }
        }
    }

}
