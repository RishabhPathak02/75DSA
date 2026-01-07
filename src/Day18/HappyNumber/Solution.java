package Day18.HappyNumber;

import java.util.HashSet;

public class Solution {
    public static boolean isHappy(int n) {
        HashSet<Integer>set = new HashSet<>();
        while (n != 1){
            if(set.contains(n))return false;
            set.add(n);
            n = getNext(n);
        }
        return true ;
    }

    private static int getNext(int n) {
        int sum = 0 ;
        while (n > 0){
            int digit = n % 10 ;
            sum += digit * digit ;
            n = n/10 ;
        }
        return sum ;
    }
}
