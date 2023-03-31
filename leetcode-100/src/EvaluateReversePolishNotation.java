import java.util.Stack;

public class EvaluateReversePolishNotation {
    public static void main(String[] args) {
        System.out.println(evalRPN(new String[]{"10","6","9","3","+","-11","*","/","*","17","+","5","+"}));
    }
    public static int evalRPN(String[] tokens) {
        int res = 0;
        if(tokens.length == 1) {
            try {
                return Integer.parseInt(tokens[0]);
            } catch (NumberFormatException e) {
                return res;
            }
        }
        Stack<Integer> stack = new Stack<>();
        for (int i = 0; i < tokens.length; i++) {
            try {
               int num = Integer.parseInt(tokens[i]);
               stack.add(num);
            } catch (NumberFormatException e) {
                int op2 = stack.pop();
                int op1 = stack.pop();
                res = evalOperation(tokens[i], op1, op2);
                stack.add(res);
            }
        }
        return res;
    }
    public static int evalOperation(String op, int operand1, int operand2) {
        if(op.equals("+")) return operand1 + operand2;
        if(op.equals("-")) return operand1 - operand2;
        if(op.equals("*")) return operand1 * operand2;
        return operand1/operand2;
    }
}
