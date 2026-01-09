package Day20.ContainerWithMostWater;

public class Brute {
    public static int maxArea(int[] height) {
        int maxWater = 0 ;
        for(int i = 0  ; i<height.length ; i++){
            for(int j = i+1 ; j<height.length ; j++){
                int width = j - i ;
                int minHeight = Math.min(height[i] , height[j]);
                int currWater = minHeight * width ;
                maxWater = Math.max(maxWater , currWater);
            }
        }
        return maxWater ;
    }
}
