public class acc2 {
    public static void main(String[] args) {
        String str = "1C0C1C1A0B1";
        // result here is 1
        System.out.println(operationsBinaryString(str));

    }

    public static int operationsBinaryString(String str) {
        int res = str.charAt(0) - '0';// -'0' is used here cause only this will return integers correct value
        for (int i = 1; i < str.length();) {
            char prev = str.charAt(i);
            i++;
            if (prev == 'A') {
                res = res & (str.charAt(i) - '0');
            } else if (prev == 'B') {
                res = res | (str.charAt(i) - '0');
            } else {
                res = res ^ (str.charAt(i) - '0');
            }
            i++;
        }
        return res;
    }
}
