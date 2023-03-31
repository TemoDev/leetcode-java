import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MedianOfTwoSortedArrays {
    public static void main(String[] args) {
        System.out.println(findMedianSortedArrays(new int[]{1,3}, new int[]{2}));
    }
    public static double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int totalLength = nums1.length + nums2.length;
        boolean isEven = totalLength % 2 == 0;
        int p1 = 0;
        int p2 = 0;
        int mIndex = totalLength / 2;
        double median = 0;
        int prev = 0;
        int curr = 0;
        while(p1 + p2 <= mIndex) {
            prev = curr;
            if(p1 > nums1.length - 1) {
                curr = nums2[p2];
                p2++;
            } else if (p2 > nums2.length - 1) {
                curr = nums1[p1];
                p1++;
            } else if (nums1[p1] > nums2[p2]) {
                curr = nums2[p2];
                p2++;
            } else {
                curr = nums1[p1];
                p1++;
            }
        }
        if(isEven) median =  (prev + curr) / 2d;
        else median = curr;
        return median;
    }

}
