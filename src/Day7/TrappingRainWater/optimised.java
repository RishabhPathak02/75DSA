package Day7.TrappingRainWater;

public class optimised {
    public static int trappedWater(int[] nums) {
        int water = 0 ;
        int left = 0 , right = nums.length-1 ;
        int leftMax = 0 , rightMax = 0 ;
        while(left < right){
            if(nums[left] < nums[right]){
                if(leftMax <= nums[left]){
                    leftMax = nums[left];
                }else {
                    water += leftMax - nums[left];
                }
                left++;
            }else{
                if(rightMax <= nums[right]){
                    rightMax = nums[right];
                }else {
                    water += rightMax - nums[right];
                }
                right--;
            }
        }
        return water ;
    }
}
