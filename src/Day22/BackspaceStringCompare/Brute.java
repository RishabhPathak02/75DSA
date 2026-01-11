package Day22.BackspaceStringCompare;

public class Brute {
    public static boolean backspaceCompare(String s, String t) {
        StringBuilder sb = new StringBuilder();
        StringBuilder tb = new StringBuilder();
        int indexS = 0;
        for (char ch : s.toCharArray()) {
            if (ch == '#') {
                if (indexS == 0)
                    continue;
                sb.deleteCharAt(indexS - 1);
                indexS--;
            } else {
                sb.append(ch);
                indexS++;
            }
        }
        int indexT = 0;
        for (char ch : t.toCharArray()) {
            if (ch == '#') {
                if (indexT == 0)
                    continue;
                tb.deleteCharAt(indexT - 1);
                indexT--;
            } else {
                tb.append(ch);
                indexT++;
            }
        }
        s = sb.toString();
        t = tb.toString();

        return s.equals(t);
    }
}
