package Day21.SquareOfSortedArray;

public class Optimised {
    public static int[] sortedSquares(int[] nums) {
        int n = nums.length ;
        int left = 0 , right = n-1 ;
        int index = n-1 ;
        int[]result = new int[n];
        while(left <= right){
            int leftSq = nums[left]*nums[left];
            int rightSq = nums[right]*nums[right];
            if(leftSq > rightSq){
                result[index--]=leftSq ;
                left++ ;
            }else{
                result[index--]=rightSq ;
                right-- ;
            }
        }
        return result ;
    }
}
