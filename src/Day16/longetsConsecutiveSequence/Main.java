package Day16.longetsConsecutiveSequence;

public class Main {
    public static void main(String[] args) {
        int[]nums = {1,0,1,2};
        int out1 = brute.longestSequence(nums);
        int out2 = optimised.longestSequence(nums);
        System.out.println(out1);
        System.out.println(out2);
    }
}
