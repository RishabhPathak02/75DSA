package Day6.SearchInSortedRotatedArray;

public class main {
    public static void main(String[] args) {
        int[]nums = {4,5,6,7,0,1,2};
        int target = 0;
        int output1 = brute.search(nums , target);
        System.out.println(output1);
        int output2 = optimised.search(nums , target);
        System.out.println(output2);
    }
}
