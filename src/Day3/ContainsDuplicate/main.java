package Day3.ContainsDuplicate;

public class main {
    public static void main(String[] args) {
        int[]nums = {1,2,3,1};
        boolean res1 = Brute.isDuplicates(nums);
        boolean res2 = Optimised.isDuplicates(nums);
        System.out.println(res1);
        System.out.println(res2);
    }


}
