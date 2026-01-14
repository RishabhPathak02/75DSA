package Day25.DailyTemperature;

public class Brute {
    public static int[] dailyTemperatures(int[] temperatures) {
        int n = temperatures.length;
        int[] output = new int[n];
        for (int i = 0; i < n; i++) {
            int currTemp = temperatures[i];
            int step = 1 ;
            for (int j = i + 1; j < n; j++) {
                if (temperatures[j] > currTemp) {
                    output[i] = step;
                    break ;
                }
                step++ ;
            }
        }
        return output ;
    }
}
