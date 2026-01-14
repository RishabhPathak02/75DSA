package Day25.DailyTemperature;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[]temp = {73,74,75,71,69,72,76,73} ;
        int[]out1 = Brute.dailyTemperatures(temp);
        int[]out2 = Optimised.dailyTemperatures(temp);
        System.out.println(Arrays.toString(out1));
        System.out.println(Arrays.toString(out2));
    }
}
