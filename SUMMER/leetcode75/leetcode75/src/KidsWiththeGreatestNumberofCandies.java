import java.util.ArrayList;
import java.util.List;

public class KidsWiththeGreatestNumberofCandies {
    public static void main(String[] args) {

    }
    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        List<Boolean> res = new ArrayList<>();
        int curMax = candies[0];
        for (int i = 0; i < candies.length; i++) {
            if (candies[i] > curMax) {
                curMax = candies[i];
            }
        }
        for (int i = 0; i < candies.length; i++) {
            if(candies[i] + extraCandies >= curMax) {
                res.add(true);
            } else {
                res.add(false);
            }
        }
        return res;
    }
}
