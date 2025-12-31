package Day11.GroupAnagram;
import java.util.*;

public class solution {
    public static List<List<String>> groupAnagrams(String[] strs) {
        Map<String, List<String>> map = new HashMap<>();
        for (String x : strs) {
            char[] arr = x.toCharArray();
            Arrays.sort(arr);
            String key = new String(arr);
            map.putIfAbsent(key, new ArrayList<>());
            map.get(key).add(x);
        }
        return new ArrayList<>(map.values());
    }
}
