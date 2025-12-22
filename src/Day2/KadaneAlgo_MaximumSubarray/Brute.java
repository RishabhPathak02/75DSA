package Day2.KadaneAlgo_MaximumSubarray;

public class Brute {
    public static int kadane(int[] nums) {
        int maxSum = 0 ;
        for(int i = 0 ; i<nums.length ; i++){
            for(int j = i+1 ; j<nums.length ; j++){
                int subArraySum = 0 ;
                for(int k = i ; k<= j ; k++){
                    subArraySum +=nums[k];
                }
                maxSum = Math.max(maxSum,subArraySum);
            }
        }
        return maxSum;
    }
}
