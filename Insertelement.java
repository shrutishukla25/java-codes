public class Insertelement {
    public static void main(String args[]) {
        int arr[] = { 4, 5, 7, 8, 9 };
        int pos = 3;
        // INSERT VALUE =6 in 3rd position.
        for (int i = arr.length - 1; i > pos - 1; i--) {
            arr[i] = arr[i - 1];
        }
        arr[pos - 1] = 6;
        for (int no : arr) {
            System.out.print(no + " ");
        }
    }

}
