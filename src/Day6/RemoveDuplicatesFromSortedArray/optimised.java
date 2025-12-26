package Day6.RemoveDuplicatesFromSortedArray;

public class optimised {
    public static int removeDuplicatesFromSortedArray(int[] nums) {
        int index = 1 ;
        for(int i = 1 ; i<nums.length ; i++){
            if(nums[i] != nums[i-1]){
                nums[index++]=nums[i];
            }
        }
        return index;
    }
}
