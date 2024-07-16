public class revofnum {
    // using recursion
    /*
     * reverse logic=>
     * int rem=num%10;
     * int rev=rev*10+rem;
     * int num=num/10;
     */
    static void reverse(int num) {

        if (num < 10) {
            System.out.print(num);
            return;
        } else {
            System.out.print(num % 10);
            reverse(num / 10);
        }

    }

    public static void main(String args[]) {
        int num = 256;
        reverse(num);
    }
}
