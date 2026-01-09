package Day20.RemoveDuplicatesFromSortedArray;
import java.util.HashMap;

public class Brute {
    public static int removeDuplicates(int[] nums) {
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int x : nums) {
            map.put(x, map.getOrDefault(x, 0) + 1);
        }
        int indx = 0;
        for (int i = 0; i < nums.length; i++) {
            int currCount = map.get(nums[i]);
            int currNum = nums[i];
            i += currCount-1 ;
            if(currCount > 2)currCount = 2 ;
            while (currCount != 0) {
                nums[indx++] = currNum;
                currCount-- ;
            }
        }
        return indx ;
    }
}
