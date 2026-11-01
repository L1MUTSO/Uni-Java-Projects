import java.util.Stack;

public class Bracket_Balancing {

    private static boolean isMatching(char open, char close) {
        return (open == '(' && close == ')')
                || (open == '[' && close == ']')
                || (open == '{' && close == '}');
    }


    public static boolean checkBalance(String str) {
        Stack<Character> stack = new Stack<>();

        int index = 0;
        while (index < str.length()) {
            char ch = str.charAt(index);
            index++;

            if (ch == '(' || ch == '[' || ch == '{') {
                stack.push(ch);
            } else if ((ch == ')' || ch == '}' || ch == ']') && !stack.isEmpty()) {
                char popped = stack.pop();
                if (!isMatching(popped, ch)) {
                    return false;
                }
            }
            else {
                return false;
            }
        }
        return stack.isEmpty();
    }
}