import java.util.Stack;

public class ParenthesesChecker {
    public static void main(String[] args) {
        System.out.println(isClosedAndNested("() ( ( ) ) )"));
        System.out.println(isClosedAndNested("( ( ( ) )"));
        System.out.println(isClosedAndNested("( ( () () ) )"));
        System.out.println(isClosedAndNested("( ( () () ) )"));
        System.out.println(isClosedAndNested(""));
    }
    private static Boolean isClosedAndNested(String code) {
        Stack<Character> s = new Stack<>();
        for (int i = 0; i < code.length(); i++) {
            if (code.charAt(i) == '(') {
                s.push(code.charAt(i));
            }
            if (code.charAt(i) == ')') {
                if (s.empty()) {
                    return false;
                }
                Character lastChar = s.pop();

                if (lastChar == '(' && code.charAt(i) != ')') {
                    return false;
                }
            }
        }
        return s.empty();
    }
}
