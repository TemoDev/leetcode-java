public class main {
    public static int[] x = new int[6];
    public static int z = 0;
    public static int y = 0;
    public static void main(String[] args) {
        for (int i = 0; i < x.length; i++) {
            x[i] = i;
            System.out.println(i);
        }
        z=5;
        y=3;
        y=f(z);
    }
    public static int f(int y) {
        y = z + x[z];
        System.out.println(z);
        return y;
    }
}
