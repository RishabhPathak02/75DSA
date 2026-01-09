package Day20.ContainerWithMostWater;

public class Main {
    public static void main(String[] args) {
        int[]nums = {1,8,6,2,5,4,8,3,7};
        int maxWater1 = Brute.maxArea(nums);
        int maxWater2 = Optimised.maxArea(nums);
        System.out.println(maxWater1);
        System.out.println(maxWater2);
    }
}
