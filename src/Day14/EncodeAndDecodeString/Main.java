package Day14.EncodeAndDecodeString;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        String[] s = {"Hello", "World"};
        System.out.println("Input"+Arrays.toString(s));
        String encodedString = Solution.encode(s);
        System.out.println("EncodedString :" +encodedString);
        String[] decodedString = Solution.decode(encodedString);
        System.out.println("DecodedString"+Arrays.toString(decodedString));
    }
}
