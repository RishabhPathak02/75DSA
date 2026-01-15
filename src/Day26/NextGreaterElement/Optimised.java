package Day26.NextGreaterElement;

import java.util.HashMap;
import java.util.Stack;

public class Optimised {
    public static int[] getNextGreaterElement(int[] nums1, int[] nums2) {
        Stack<Integer>st = new Stack<>();
        HashMap<Integer , Integer> map = new HashMap<>();
        int n = nums1.length ;
        int m = nums2.length ;
        int[]result = new int[n];
        //process nums2
        for(int i = 0 ; i< m ;i++){
            while(!st.isEmpty() && st.peek() < nums2[i]){
                map.put(st.pop() , nums2[i]);
            }
            st.push(nums2[i]);
        }
        while (!st.isEmpty()){
            map.put(st.pop() , -1);
        }
        //add into result array for each num1 element their greater element
        for(int i = 0 ; i < n ; i++){
            result[i] = map.get(nums1[i]);
        }
        return result ;
    }
}
