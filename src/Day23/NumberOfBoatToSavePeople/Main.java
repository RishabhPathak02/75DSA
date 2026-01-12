package Day23.NumberOfBoatToSavePeople;

public class Main {
    public static void main(String[] args) {
        int[]people = {3,5,3,4} ;
        int limit = 5 ;
        int out1 = Brute.numRescueBoats(people , limit);
        int out2 = Optimised.numRescueBoats(people , limit);
        System.out.println(out1);
        System.out.println(out2);
    }
}
