package Day17.IntersectionTwoArrays;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[]nums1 = {1,2,2,1};
        int[]nums2 = {2,2} ;
        int[]out = Solution.IntersectionOfArray(nums1 , nums2);
        System.out.println(Arrays.toString(out));
    }
}
