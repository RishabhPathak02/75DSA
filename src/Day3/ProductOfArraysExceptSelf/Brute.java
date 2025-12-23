package Day3.ProductOfArraysExceptSelf;

public class Brute {
    public static int[] productOfElement(int[] nums) {
        int[]output = new int[nums.length];
        for(int i = 0 ; i<nums.length ; i++){
            int product = 1 ;
            for(int j = 0 ; j<nums.length ; j++){
                if(j !=i){
                    product *= nums[j];
                }
            }
            output[i]=product;
        }
        return output;
    }
}
