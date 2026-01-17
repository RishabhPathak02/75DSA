package Day28.DecodeString;

public class Main {
    public static void main(String[] args) {
        String s  = "3[a]2[bc]" ;
        String out1 = Brute.decodeString(s);
        String out2 = Optimised.decodeString(s);
        System.out.println(out1);
        System.out.println(out2);
    }
}
