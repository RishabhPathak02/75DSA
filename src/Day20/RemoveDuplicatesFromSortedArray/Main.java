package Day20.RemoveDuplicatesFromSortedArray;

public class Main {
    public static void main(String[] args) {
        int[]nums1 = {1,1,1,2,2,3};
        int[]nums2= {1,1,1,2,2,3};
        int k1 = Brute.removeDuplicates(nums1);
        int k2 = Optimised.removeDuplicates(nums2);
        System.out.println(k1);
        System.out.println(k2);
    }
}
