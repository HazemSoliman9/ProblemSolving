import java.util.Stack;

public class ValidParentheses {
    public static boolean isValid(String s) {
        Stack<Character> stack = new Stack<>();

        for (int i = 0; i < s.length(); i++) {

            switch (s.charAt(i)) {
                case '(':
                case '{':
                case '[':
                    stack.push(s.charAt(i));

                    System.out.println(stack);
                    break;

                case ')': {
                    if(stack.isEmpty())
                        return false;
                    if (stack.peek() != '('  ) {
                        return false;
                    } else {
                        stack.pop();
                    }
                }

                System.out.println(stack);
                break;


                case ']': {
                    if(stack.isEmpty())
                        return false;
                    if (stack.peek() != '[' ) {
                        return false;
                    } else {
                        stack.pop();
                    }
                }

                System.out.println(stack);
                break;
                case '}': {
                    if(stack.isEmpty())
                        return false;
                    if (stack.peek() != '{' )
                        return false;
                    else
                        stack.pop();
                }
                System.out.println(stack);
                break;
            }


        }

        System.out.println(stack);
        if (stack.isEmpty())
            return true;
        return false;
    }

    public static void main(String[] args) {
        String s = ")[]{}";
        System.out.println(isValid(s));
    }
}
