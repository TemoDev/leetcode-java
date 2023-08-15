public class mergeStringsAlternately {

    public static void main(String[] args) {
        System.out.println(mergeAlternately("", "11"));
    }

    public static String mergeAlternately(String word1, String word2) {
        int counter = 0;
        StringBuilder res = new StringBuilder();

        while (true) {
            if(word1.length() == counter) {
                res.append(word2.substring(counter));
                break;
            }
            res.append(word1.charAt(counter));
            if(word2.length() == counter) {
                res.append(word1.substring(counter + 1));
                break;
            }
            res.append(word2.charAt(counter));
            counter++;
        }

        return res.toString();
    }
}
