import java.security.KeyPair;
import java.util.Arrays;
import java.util.Stack;

public class DailyTemperatures {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(dailyTemperatures(new int[]{73,74,75,71,69,72,76,73})));
        System.out.println(Arrays.toString(dailyTemperatures(new int[]{30,40,50,60})));
        System.out.println(Arrays.toString(dailyTemperatures(new int[]{30,60,90})));
    }
    public static int[] dailyTemperatures(int[] temperatures) {
        int[] res = new int[temperatures.length];
        Stack<int[]> stack = new Stack<>();

        for (int i = 0; i < temperatures.length; i++) {
            while (stack.size() != 0 && stack.peek()[0] < temperatures[i]) {
                int popIndex = stack.pop()[1];
                res[popIndex] = i - popIndex;
            }
            stack.add(new int[]{temperatures[i], i});
        }

        return res;
    }
}
