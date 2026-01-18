package Day29.LargestRectangleHistrogram;

public class Main {
    public static void main(String[] args) {
        int[]heights = {2,1,5,6,2,3};
        int out1 = Brute.largestRectangleArea(heights);
        int out2 = Optimised.largestRectangleArea(heights);
        System.out.println(out1);
        System.out.println(out2);
    }
}
