package Day8.kthlargestElement;

public class main {
    public static void main(String[] args) {
        int[]nums = {3,2,1,5,6,4};
        int k = 2 ;
        int out1 = brute.kthLargest(nums , k);
        int out2 = optimised.kthLargest(nums , k);
        System.out.println(out1);
        System.out.println(out2);
    }
}
