package Day16.SubArraySumEqualsToK;

public class Main {
    public static void main(String[] args) {
        int[]nums = {1,1,1};
        int k = 2 ;
        int out1 = brute.subarraySum(nums , k);
        int out2 = optmised.subarraySum(nums , k);
        System.out.println(out1);
        System.out.println(out2);
    }
}
