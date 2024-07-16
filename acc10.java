public class acc10 {
    public static void main(String[] args) {
        int num1 = 23;
        int num2 = 349;
        int t1 = num1;
        int t2 = num2;
        int countofcarry = 0;
        int carry = 0;
        while (t1 != 0 && t2 != 0) {
            int d1 = t1 % 10, d2 = t2 % 10;
            if ((d1 + d2 + carry) > 9) {
                countofcarry += 1;
                int sum = d1 + d2 + carry;
                carry = sum / 10;
            }
            t1 = t1 / 10;
            t2 = t2 / 10;
        }
        while (t1 != 0) {
            int d1 = t1 % 10;
            if ((d1 + carry) > 9) {
                countofcarry += 1;
                int sum = d1 + carry;
                carry = sum / 10;
            }
            t1 = t1 / 10;
        }
        while (t2 != 0) {
            int d2 = t2 % 10;
            if ((d2 + carry) > 9) {
                countofcarry += 1;
                int sum = d2 + carry;
                carry = sum / 10;
            }
            t2 = t2 / 10;
        }
        System.out.println(countofcarry);
    }
}
