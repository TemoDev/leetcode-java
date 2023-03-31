import java.util.HashMap;
import java.util.Map;
import java.util.Stack;

public class ValidParentheses {
    public static void main(String[] args) {
        System.out.println(isValid("({)"));
    }
//    public static boolean isValid(String s) {
//        Stack<Character> stack = new Stack<>();
//        int pointer = 0;
//        while(pointer < s.length()) {
//            if(stack.size() != 0) {
//                if (!isPair(stack.peek(), s.charAt(pointer))) stack.add(s.charAt(pointer));
//                else stack.pop();
//            } else {
//                stack.add(s.charAt(pointer));
//            }
//            pointer++;
//        }
//        return stack.size() == 0;
//    }
//    public static boolean isPair(char a, char b) {
//        if(a == '(' && b == ')') return true;
//        if(a == '[' && b == ']') return true;
//        return a == '{' && b == '}';
//    }

    public static boolean isValid(String s) {
            Stack<Character> stack = new Stack<>();
            Map<Character, Character> map = new HashMap<>();
            map.put(')', '(');
            map.put('}', '{');
            map.put(']', '[');
            int pointer = 0;
            while(pointer < s.length()) {
                if (stack.size() != 0 && stack.peek() == map.get(s.charAt(pointer))) stack.pop();
                else stack.add(s.charAt(pointer));
                pointer++;
            }
            return stack.size() == 0;
    }

}
