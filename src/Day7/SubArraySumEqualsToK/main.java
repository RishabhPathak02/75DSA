package Day7.SubArraySumEqualsToK;

public class main {
    public static void main(String[] args) {
        int[]nums = {1,1,1};
        int k = 2 ;
        int out1 = brute.findSubArray(nums , k );
        int out2 = optimised.findSubArray(nums , k );
        System.out.println(out1);
        System.out.println(out2);
    }
}
