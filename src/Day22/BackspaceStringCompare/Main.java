package Day22.BackspaceStringCompare;

public class Main {
    public static void main(String[] args) {
        String s = "a#c#a" , t = "d#c#a" ;
        boolean out1 = Brute.backspaceCompare(s,t);
        boolean out2 = Optimised.backspaceCompare(s,t);
        System.out.println(out1);
        System.out.println(out2);
    }
}
