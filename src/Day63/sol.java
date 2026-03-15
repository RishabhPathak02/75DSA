package Day63;

public class sol {
    class Solution {
        public int rob(int[] nums) {
            int p2 = 0;
            int p1 = 0;
            for (int num : nums) {
                int pick = num + p2;
                int skip = p1;

                int curr = Math.max(pick, skip);
                p2 = p1;
                p1 = curr;
            }
            return p1;
        }
    }
}
