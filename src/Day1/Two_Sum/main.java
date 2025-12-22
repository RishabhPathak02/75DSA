package Day1.Two_Sum;
import java.util.Arrays;
public class main {
    public static void main(String[] args) {
        int[]nums = {2,7,11,15} ;
        int target = 9 ;
        int []result1 = BruteForce.twoSum(nums , target);
        int []result2 = Optimised.twoSum(nums , target);
        System.out.println(Arrays.toString(result1));
        System.out.println(Arrays.toString(result2));

    }
}
