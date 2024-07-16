public class acc13 {
    public static void main(String[] args) {
        int a = 7, b = 12;
        System.out.println(MaxExponents(a, b));
    }

    public static int MaxExponents(int a, int b) {
        int num = 0;
        int max = Integer.MIN_VALUE;
        for (int i = a; i <= b; i++) {
            int temp = count(i);
            if (temp > max) {
                max = temp;
                num = i;
            }
        }
        return num;
    }

    public static int count(int i) {
        int countint = 0;
        while (i % 2 == 0 && i != 0) {
            countint += 1;
            i = i / 2;

        }
        return countint;
    }
}
