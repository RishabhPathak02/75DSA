package Day7.TrappingRainWater;

public class main {
    public static void main(String[]args){
        int[]nums = {0,1,0,2,1,0,1,3,2,1,2,1};
        int outp1 = brute.trappedWater(nums);
        int outp2 = optimised.trappedWater(nums);
        System.out.println(outp1);
        System.out.println(outp2);
    }
}
