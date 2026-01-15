package Day26.NextGreaterElement;

public class Brute {
    public static int[] getNextGreaterElement(int[] nums1, int[] nums2) {
        int n = nums1.length;
        int m = nums2.length;
        int[]result = new int[n];
        for (int i = 0; i < n; i++) {
            int current = nums1[i];
            //find current in nums2 array
            int index = -1 ;
            for(int j = 0 ; j<m ; j++){
                if(current == nums2[j]){
                    index = j ;
                    break;
                }
            }
            //find next greater elment for current value
            int nextGreater = - 1 ;
            for(int j = index+1 ; j<m ; j++){
                if(current < nums2[j]){
                    nextGreater = nums2[j];
                    break;
                }
            }
            result[i] = nextGreater ;
        }
        return result ;
    }
}
