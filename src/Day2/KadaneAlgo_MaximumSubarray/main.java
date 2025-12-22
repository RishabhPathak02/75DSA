package Day2.KadaneAlgo_MaximumSubarray;

public class main {
    public static void main(String[] args) {
        int[]nums = {-2,1,-3,4,-1,2,1,-5,4};
        int result1 = Brute.kadane(nums);
        int result2 = Optimised.kadane(nums);
        System.out.println(result1);
        System.out.println(result2);
    }
}
