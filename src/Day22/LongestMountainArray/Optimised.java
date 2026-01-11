package Day22.LongestMountainArray;

public class Optimised {
    public static int longestMountain(int[] arr) {
        int n = arr.length;
        if (n < 3) return 0;
        int up = 0, down = 0, maxLen = 0;
        for (int i = 1; i < n; i++) {
            if (arr[i - 1] == arr[i] || ((down > 0) && (arr[i - 1] < arr[i]))) {
                up = 0;
                down = 0;
            }
            if (arr[i] > arr[i - 1]) up++;
            if (arr[i - 1] > arr[i]) down++;
            if (down > 0 && up > 0) {
                maxLen = Math.max(maxLen, up + down + 1);
            }
        }
        return maxLen;
    }
}
