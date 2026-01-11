package Day22.TrappingRainWater;

public class Optimised {
    public static int trappingRainWater(int[] height) {
        int n = height.length ;
        int left = 0 ;
        int right = n-1 ;
        int leftmax = 0 , rightmax = 0 ;
        int water = 0 ;
        while(left < right){
            if(height[left] < height[right]){
                if(leftmax <= height[left]){
                    leftmax = height[left];
                }else {
                    water += leftmax - height[left] ;
                }
                left++ ;
            }else {
                if(rightmax <= height[right]){
                    rightmax = height[right];
                }else {
                    water += rightmax - height[right] ;
                }
                right-- ;
            }
        }
        return water ;
    }
}
