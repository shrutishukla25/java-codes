public class acc14 {
    public static void main(String[] args) {
        int m = 100, n = 160;
        System.out.println(Calculate(m, n));
    }

    public static int Calculate(int m, int n) {
        int sum = 0;
        for (int i = m; i <= n; i++) {
            if (i % 3 == 0 && i % 5 == 0) {
                sum += i;
            }
        }
        return sum;
    }
}
