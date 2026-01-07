package Day18.ContainsDublicate2;

public class Main {
    public static void main(String[] args) {
        int[]nums = {1,2,3,1} ;
        int k = 3 ;
        boolean out1 = Brute.containsNearbyDuplicate(nums , k);
        boolean out2 = Optimised.containsNearbyDuplicate(nums , k);
        System.out.println(out1);
        System.out.println(out2);
    }
}
