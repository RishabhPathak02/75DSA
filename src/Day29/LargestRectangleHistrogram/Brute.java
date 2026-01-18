package Day29.LargestRectangleHistrogram;

public class Brute {
    public static int largestRectangleArea(int[] heights) {
        int n = heights.length ;
        int area = 0 ;
        for(int i = 0 ; i< n ; i++){
            int minHeight = heights[i];
            for(int j = i ; j < n ; j++){
                minHeight = Math.min(minHeight , heights[j]);
                int width = j - i + 1 ;
                area = Math.max(area , minHeight*width);
            }
        }
        return area ;
    }
}
