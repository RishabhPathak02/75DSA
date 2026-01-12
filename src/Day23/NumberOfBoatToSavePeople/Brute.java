package Day23.NumberOfBoatToSavePeople;

public class Brute {
    public static int numRescueBoats(int[] people, int limit) {
        int s = people.length;
        int numBoat = 0;
        boolean[] used = new boolean[s];

        for (int i = 0; i < s; i++) {
            if (used[i]) continue;

            boolean paired = false;

            for (int j = i + 1; j < s; j++) {
                if (!used[j] && people[i] + people[j] <= limit) {
                    used[i] = true;
                    used[j] = true;
                    numBoat++;
                    paired = true;
                    break;
                }
            }

            if (!paired) {
                used[i] = true;
                numBoat++;
            }
        }

        return numBoat;
    }
}
