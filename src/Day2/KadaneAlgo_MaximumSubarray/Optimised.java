package Day2.KadaneAlgo_MaximumSubarray;

public class Optimised {
    public static int kadane(int[] nums) {
        int currSum = 0 ;
        int maxSum = 0 ;
        for(int i = 0 ;i<nums.length ; i++){
            currSum = Math.max(nums[i] , currSum+nums[i]);
            maxSum = Math.max(maxSum,currSum);
        }
        return maxSum;
    }
}
