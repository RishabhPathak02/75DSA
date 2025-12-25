package Day5.majorityElement;

public class optimised {
    public static int majorityElementAppearing(int[] nums) {
        int count = 0 ;
        int candidate = -1 ;
        for(int x : nums){
            if(count == 0){
                candidate = x;
            }
            count = candidate == x ? count+1 : count-1 ;
        }
        return candidate;
    }
}
