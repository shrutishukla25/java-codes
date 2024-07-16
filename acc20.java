
class acc20 {
    public static int findAutoCount(String n) {
        int arr[] = new int[10];
        int sum = 0;
        for (int i = 0; i < n.length(); i++) {
            sum = sum + (n.charAt(i) - '0');
        }
        if (sum == n.length()) {
            int count = 0;
            for (int i = 0; i < n.length(); i++) {
                arr[i] = n.charAt(i) - '0';
            }
            for (int i = 0; i < arr.length; i++) {
                if (arr[i] != 0) {
                    count++;
                }
            }
            return count;
        } else {
            return 0;
        }
    }

    public static void main(String[] args) {

        String str = "1210";
        System.out.println(findAutoCount(str));
    }
}