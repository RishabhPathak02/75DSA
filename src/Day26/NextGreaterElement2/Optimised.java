package Day26.NextGreaterElement2;

import java.util.Arrays;
import java.util.Stack;

public class Optimised {
    public static int[] nextGreaterElements(int[] nums) {
        int n = nums.length ;
        int[]result = new int[n];
        Arrays.fill(result,-1);
        Stack<Integer>st = new Stack<>();
        for(int i = 0  ; i<2*n ; i++){
            int indx = i % n ;
            while (!st.isEmpty() && nums[st.peek()] < nums[indx]){
                result[st.pop()] = nums[indx];
            }
            if(i < n){
                st.push(i);
            }
        }
        return result;
    }
}
