package Day23.PartitionLabel;

import java.util.ArrayList;
import java.util.List;

public class Solution {
    public static List<Integer> partitionLabels(String s) {
        int[] lastIndex = new int[26];
        int n = s.length() ;
        List<Integer> result = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            lastIndex[s.charAt(i) - 'a'] = i;
        }
        int start = 0;
        int end = 0;
        for (int i = 0; i < n; i++) {
            end = Math.max(end, lastIndex[s.charAt(i) - 'a']);
            if (i == end) {
                result.add(end - start + 1);
                start = i + 1;
            }
        }
        return result ;
    }
}
