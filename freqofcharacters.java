public class freqofcharacters {

    static void countfreq(String s) {
        char c[] = s.toCharArray();
        int f[] = new int[c.length];
        for (int i = 0; i < f.length; i++) {
            f[i] = -1;
        }

        for (int i = 0; i < s.length(); i++) {
            int count = 1;
            for (int j = i + 1; j < s.length(); j++) {
                if (c[i] == c[j]) {
                    count++;
                    f[j] = 0;
                }
            }
            if (f[i] != 0) {
                f[i] = count;
            }

        }

        for (int i = 0; i < c.length; i++) {
            if (f[i] != 0) {
                System.out.println(c[i] + " comes " + f[i] + " times.");
            }
        }

    }

    public static void main(String args[]) {
        String s = "shhrruuttiii";
        countfreq(s);
    }
}
