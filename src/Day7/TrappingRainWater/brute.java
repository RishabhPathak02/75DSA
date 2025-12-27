package Day7.TrappingRainWater;

public class brute {
    public static int trappedWater(int[] nums) {
        int water = 0 ;
        for(int i = 0 ; i<nums.length ; i++){
            //leftMax
            int leftMax = 0 ;
            for(int j = 0 ; j<= i ; j++){
                leftMax = Math.max(leftMax , nums[j]);
            }
            //rightMax
            int rightMax = 0 ;
            for(int j = i ; j<nums.length ; j++){
                rightMax = Math.max(rightMax,nums[j]);
            }
            //water calculation
            water += Math.min(leftMax , rightMax) - nums[i];
        }
        return water;
    }
}
