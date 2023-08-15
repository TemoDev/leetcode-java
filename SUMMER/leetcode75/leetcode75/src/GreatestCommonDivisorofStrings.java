import java.util.ArrayList;
import java.util.List;

public class GreatestCommonDivisorofStrings {
    public static void main(String[] args) {
        System.out.println(gcdOfStrings("", ""));
    }
    public static String gcdOfStrings(String str1, String str2) {
        return (((str1 + str2).equals(str2 + str1))) ? str1.substring(0, gcd(str1.length(),str2.length())): "";
    }
    public static int gcd(int a, int b) {
        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }
}
