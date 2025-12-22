package Day2.MoveZeroes;

public class Brute {

    public static void moveZero(int[] nums) {
        int n = nums.length ;
        for(int i = 0 ; i< n ; i++){
            if(nums[i]==0){
                //shifting towards left
                for(int j = i ; j<n-1 ; j++){
                    nums[j]=nums[j+1];
                }
                nums[n-1]=0 ;
                n-- ;
                i-- ;
            }

        }
    }
}
