package Day15.IsomorphicString;

public class main {
    public static void main(String[] args) {
        String s = "paper", t = "title" ;
        System.out.println("Is isomorphic : "+ brute.isIsomorphic(s,t));
        System.out.println("Is isomorphic : "+ optimised.isIsomorphic(s,t));
    }
}
