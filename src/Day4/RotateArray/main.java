package Day4.RotateArray;
import java.util.Arrays;

public class main {
    public static void main(String[] args) {
        int[]nums1 = {1,2,3,4,5,6,7};
        int[]nums2 = {1,2,3,4,5,6,7};
        int k = 3 ;
        brute.rotateArray(nums1 , k);
        optimised.rotateArray(nums2 , k);
        System.out.println(Arrays.toString(nums1));
        System.out.println(Arrays.toString(nums2));
    }
}
