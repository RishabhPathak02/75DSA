package Day11.GroupAnagram;

import java.util.Collections;
import java.util.List;

public class main {
    public static void main(String[] args) {
        String[] strs = {"eat", "tea", "tan", "ate", "nat", "bat"};
        List<List<String>>ans = solution.groupAnagrams(strs);
        System.out.println(ans);
    }
}
