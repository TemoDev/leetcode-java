public class ValidPalindrome {
    public static void main(String[] args) {
        System.out.println(isPalindrome("ab_a"));
    }
    public static boolean isPalindrome(String s) {
        s = s.toLowerCase().replaceAll("[^a-zA-Z0-9]", "");
        if(s.length() == 0) return true;
        int startPointer = 0;
        int endPointer = s.length() - 1;
        while(startPointer < endPointer) {
            if(s.charAt(startPointer) != s.charAt(endPointer)) return false;
            startPointer++;
            endPointer--;
        }
        return true;
    }
}
