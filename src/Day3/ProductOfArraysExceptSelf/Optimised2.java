package Day3.ProductOfArraysExceptSelf;
//no use of extra array ;
public class Optimised2 {
    public static int[]productOfElement(int[]nums){
        int n = nums.length ;
        int[]output = new int[n];
        //left processting -->
        output[0]=1 ;
        for(int i = 1 ; i<n ; i++){
            output[i]=nums[i-1] * output[i-1];
        }
        //rightProcessing -->
        int rightProduct = 1 ;
        for(int i = n-1 ; i>=0 ; i--){
            output[i] *=rightProduct;
            rightProduct *= nums[i];
        }
        return output;
    }
}
