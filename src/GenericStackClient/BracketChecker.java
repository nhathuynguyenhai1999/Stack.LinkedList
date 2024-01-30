package GenericStackClient;
import java.util.Stack;
public class BracketChecker {
    public static boolean isBracketBalanced(String expression) {
        Stack<Character> bracketStack = new Stack<>();

        for (char ch : expression.toCharArray()) {
            if (ch == '(' || ch == '[' || ch == '{') {
                bracketStack.push(ch);
            } else if (ch == ')' || ch == ']' || ch == '}') {
                if (bracketStack.isEmpty()) {
                    return false;
                }

                char leftBracket = bracketStack.pop();

                if (!isMatchingPair(leftBracket, ch)) {
                    return false;
                }
            }
        }

        return bracketStack.isEmpty(); // Kiểm tra xem có dấu ngoặc không được đóng đúng
    }

    private static boolean isMatchingPair(char left, char right) {
        return (left == '(' && right == ')') ||
                (left == '[' && right == ']') ||
                (left == '{' && right == '}');
    }

    public static void main(String[] args) {
        String expression1 = "s * (s – a) * (s – b) * (s – c)";
        String expression2 = "(– b + (b2 – 4*a*c)^0.5) / 2*a";
        String expression3 = "s * (s – a) * s – b) * (s – c)";
        String expression4 = "(– b + (b^2 – 4*a*c)^(0.5/ 2*a))";

        System.out.println(expression1 + " → " + isBracketBalanced(expression1));
        System.out.println(expression2 + " → " + isBracketBalanced(expression2));
        System.out.println(expression3 + " → " + isBracketBalanced(expression3));
        System.out.println(expression4 + " → " + isBracketBalanced(expression4));
    }
}
