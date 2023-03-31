public class PalindromeNumber {
    public static void main(String[] args) {
        System.out.println(isPalindrome(121));
    }
    public static boolean isPalindrome(int x) {
        if(x < 0) return false;
        int num = 0;
        int y = x;
        while(x != 0) {
            num *= 10;
            num += x % 10;
            x = x / 10;
        }
        return num == y;
    }
}
