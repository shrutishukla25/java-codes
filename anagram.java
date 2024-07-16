import java.util.*;
/*Anagram:two strings are said to be anagram if they contain same characters but in different order
,also words have same length*/

public class anagram {
    public static void main(String args[]) {
        String s1 = "java";
        String s2 = "vaja";

        char c1[] = s1.toCharArray();
        char c2[] = s2.toCharArray();
        Arrays.sort(c1);
        Arrays.sort(c2);
        System.out.println("Given Strings are anagram " + Arrays.equals(c1, c2));

    }
}
