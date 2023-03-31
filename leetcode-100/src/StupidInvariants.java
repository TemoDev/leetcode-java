import java.util.Scanner;

public class StupidInvariants {
    public static void main(String[] args) {
        amazingInvariant();
    }
    public static void amazingInvariant() {
        int x = 0;
        int i = 0;
        Scanner sc= new Scanner(System.in);
        System.out.print("Enter an integer: ");
        int n= sc.nextInt();

        while(i != n) {
            i++;
            int j = i;
            System.out.println("J is: " + j + " I is: " + i);
            while(j > 0) {
                x = x + i;
                j--;
                System.out.println("on iteration of x is: " + x);
            }
        }
        System.out.println(x);
    }

}
