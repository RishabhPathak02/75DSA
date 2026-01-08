package Day19.ValidSuduko;

import java.util.HashSet;

public class Solution {
    public static boolean isValidSudoku(String[][] board) {
        HashSet<String>[] rows = new HashSet[9];
        HashSet<String>[] cols = new HashSet[9];
        HashSet<String>[] boxes = new HashSet[9];

        for (int i = 0; i < 9; i++) {
            rows[i] = new HashSet<>();
            cols[i] = new HashSet<>();
            boxes[i] = new HashSet<>();
        }

        for (int i = 0; i < 9; i++) {
            for (int j = 0; j < 9; j++) {
                String curr = board[i][j];
                if (curr ==".")
                    continue;
                int boxIndex = (i / 3) * 3 + j / 3;
                if (rows[i].contains(curr) || cols[j].contains(curr) || boxes[boxIndex].contains(curr))
                    return false;
                rows[i].add(curr);
                cols[j].add(curr);
                boxes[boxIndex].add(curr);

            }
        }
        return true;
    }
}
