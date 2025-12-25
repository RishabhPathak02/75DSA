package Day5.findMinimumInSortedArray;

public class brute {
    public static int findMinimum(int[]nums){
        int min = Integer.MAX_VALUE;
        for(int x : nums){
            min = Math.min(min , x);
        }
        return min;
    }
}
