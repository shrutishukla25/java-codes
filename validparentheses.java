import java.util.Stack;

public class validparentheses {

    public static boolean isValid(String s) {
        Stack<Character> st = new Stack<>();
        for (char a : s.toCharArray()) {
            if (a == '(' || a == '{' || a == '[') {
                // for opening bracket
                st.push(a);
            } else {// for closing bracket
                if (st.isEmpty()) {
                    return false;
                } else {
                    char b = st.peek();
                    st.pop();
                    if (a == ')' && b == '(' || a == ']' && b == '[' || a == '}' && b == '{') {
                        continue;
                    } else {
                        return false;
                    }
                }
            }
        }

        return st.isEmpty();

    }

    public static void main(String args[]) {
        String s = "[](";
        System.out.println(isValid(s));

    }
}
