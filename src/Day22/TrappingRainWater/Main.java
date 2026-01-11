package Day22.TrappingRainWater;

public class Main {
    public static void main(String[] args) {
        int[] height = {0, 1, 0, 2, 1, 0, 1, 3, 2, 1, 2, 1};
        int out1 = Brute.trappingRainWater(height);
        int out2 = Optimised.trappingRainWater(height);
        System.out.println(out1);
        System.out.println(out2);
    }
}
