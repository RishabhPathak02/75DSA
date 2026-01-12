package Day23.NumberOfBoatToSavePeople;

import java.util.Arrays;

public class Optimised {
    public static int numRescueBoats(int[] people, int limit) {
        int n = people.length;
        Arrays.sort(people);
        int low = 0, high = n - 1, numBoat = 0;
        while (low <= high) {
            if (people[low] + people[high] <= limit) {
                low++;
            }
            high--;
            numBoat++;
        }
        return numBoat++;
    }
}
