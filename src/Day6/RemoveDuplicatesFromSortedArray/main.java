package Day6.RemoveDuplicatesFromSortedArray;

public class main {
    public static void main(String[] args) {
        int[]nums = {1,1,2};
        int out1 = brute.removeDuplicatesFromSortedArray(nums);
        int out2 = optimised.removeDuplicatesFromSortedArray(nums);
        System.out.println(out1);
        System.out.println(out2);
    }
}
