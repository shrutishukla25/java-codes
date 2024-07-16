public class replacestring {
    public static void main(String args[]) {
        String s = "I am the the moon";
        String oldstring = "moon";
        String newstring = "star";
        System.out.println(s.replace(oldstring, newstring));
        System.out.println(s.replaceAll("the", "a"));
    }

}
