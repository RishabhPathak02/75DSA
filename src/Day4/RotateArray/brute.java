package Day4.RotateArray;

public class brute {
    public static void rotateArray(int[] nums, int k) {
        //rotate 1 step k times
        for(int i = 0 ; i<k ; i++){
            int last = nums[nums.length-1];
            for(int j = nums.length-1 ; j>0 ;j--){
                nums[j]= nums[j-1];
            }
            nums[0]=last;
        }
    }
}
