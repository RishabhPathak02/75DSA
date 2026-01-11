package Day22.TrappingRainWater;

public class Brute {
    public static int trappingRainWater(int[] height) {
        int water = 0;
        int n = height.length;
        for (int i = 0; i < n; i++) {
            int leftMax = 0 ;
            for (int l = i; l >=0 ; l--) {
                leftMax = Math.max(leftMax, height[l]);
            }
            int rightMax = 0 ;
            for (int r = i; r < n ; r++) {
                rightMax = Math.max(rightMax, height[r]);
            }
            int trappedWater = Math.min(leftMax , rightMax) - height[i];
            if(trappedWater > 0){
                water += trappedWater;
            }
        }
        return water;
    }
}
