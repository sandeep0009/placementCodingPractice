import java.util.Stack;

public class Balance {
    public static boolean checkBalance(String s) {
        Stack<Character> stack = new Stack<>();

        for (int i = 0; i < s.length(); i++) {
            char cur = s.charAt(i);

            if (cur == '{' || cur == '[' || cur == '(') {
                stack.push(cur);
            } else if (cur == '}' || cur == ']' || cur == ')') {
                if (stack.isEmpty()) return false;

                char check = stack.pop();

                switch (cur) {
                    case ')':
                        if (check != '(') return false;
                        break;

                    case '}':
                        if (check != '{') return false;
                        break;

                    case ']':
                        if (check != '[') return false;
                        break;

                    default:
                        break;
                }
            }
        }

        return stack.isEmpty();
    }

    public static void main(String[] args) {
        String balancedString = "{[()]}";
        String unbalancedString = "{[(])}";

        System.out.println(checkBalance(balancedString)); 
        System.out.println(checkBalance(unbalancedString)); 
    }
}
