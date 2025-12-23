package Day3.ContainsDuplicate;

public class Brute {
    protected static boolean isDuplicates(int[] nums) {
        for(int i = 0 ; i<nums.length ; i++){
            for (int j = i+1 ; j<nums.length ;j++){
                if(nums[i]==nums[j])return true;
            }
        }
        return false;
    }
}
