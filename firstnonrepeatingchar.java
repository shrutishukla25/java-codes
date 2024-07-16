public class firstnonrepeatingchar {
    static void uniquechar(String s) {
        for (int i = 0; i < s.length(); i++) {
            boolean unique = true;
            for (int j = 0; j < s.length(); j++) {
                if (i != j && s.charAt(i) == s.charAt(j)) {
                    unique = false;
                    break;
                }
            }
            if (unique) {
                System.out.println("First unique char is " + s.charAt(i));
                break;

            }
        }

    }

    public static void main(String args[]) {
        String s = "geeksforgeeks";
        uniquechar(s);

    }
}
