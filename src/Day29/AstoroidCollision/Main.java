package Day29.AstoroidCollision;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[]asteroids = {5,10,-5};
        int[]out = Solution.asteroidCollision(asteroids);
        System.out.println(Arrays.toString(out));
    }
}
