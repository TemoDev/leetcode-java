import java.util.Arrays;

public class main {
    public static void main(String[] args) {
        int[] a = new int[]{1,2,3};
        int[] b = a.clone();
        b[0] = 4;
        System.out.println(Arrays.toString(a));
        System.out.println(Arrays.toString(b));
    }
}
