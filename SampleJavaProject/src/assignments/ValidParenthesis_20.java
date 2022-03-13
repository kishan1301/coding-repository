import java.util.Stack;

public class ValidParenthesis_20 {
    public static void main(String[] args) {
        String s = "()}";
        System.out.println(isValid(s));

    }

    public static boolean isValid(String s) {
        Stack<Character> stack = new Stack<>();
        for (char c : s.toCharArray()) {
            if (stack.isEmpty()
                    && (c == ')'
                    || c == '}'
                    || c == ']'))
                return false;
            else if (!stack.isEmpty()
                    && (stack.peek() == '{' && c == '}'
                    || stack.peek() == '(' && c == ')'
                    || stack.peek() == '[' && c == ']')
            )
                stack.pop();
            else
                stack.push(c);

        }
        return stack.isEmpty();
    }
}
