package Day20.ContainerWithMostWater;

public class Optimised {
    public static int maxArea(int[] nums) {
        int n = nums.length ;
        int left = 0 ;
        int right = n-1 ;
        int maxWater = 0 ;
        while(left < right){
            int width = right - left ;
            int minHeight = Math.min(nums[left],nums[right]);
            int currWater = width * minHeight ;
            maxWater = Math.max(maxWater , currWater);
            if(nums[left] < nums[right]){
                left++ ;
            }else{
                right-- ;
            }
        }
        return maxWater;
    }
}
