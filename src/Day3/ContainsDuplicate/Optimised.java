package Day3.ContainsDuplicate;

import java.util.HashSet;
import java.util.Set;

public class Optimised {
    protected static boolean isDuplicates(int[]nums){
        Set<Integer>set = new HashSet<>();
        for(int x : nums){
            if(!set.add(x))return true ;
        }
        return false ;
    }
}
