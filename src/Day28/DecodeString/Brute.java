package Day28.DecodeString;

public class Brute {
    static int index = 0;
    public static String decodeString(String s) {
        int n = s.length();
        StringBuilder result = new StringBuilder();
        while (index < n && s.charAt(index) != ']') {
            char ch = s.charAt(index);
            if (Character.isDigit(ch)) {
                int k = 0;
                while (Character.isDigit(s.charAt(index)) && index < n) {
                    k = k * 10 + (s.charAt(index) - '0');
                    index++;
                }
                index++;
                String decoded = decodeString(s);
                index++;
                result.append(decoded.repeat(k));
            } else {
                result.append(ch);
                index++;
            }
        }
        return result.toString();
    }
}
