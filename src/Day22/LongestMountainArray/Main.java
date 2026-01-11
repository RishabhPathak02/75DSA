package Day22.LongestMountainArray;

public class Main {
    public static void main(String[] args) {
        int[] arr = {2, 1, 4, 7, 3, 2, 5};
        int out1 = Brute.longestMountain(arr);
        int out2 = Optimised.longestMountain(arr);
        System.out.println(out1);
        System.out.println(out2);
    }
}
