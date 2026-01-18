package Day29.SimplifyPath;

public class Main {
    public static void main(String[] args) {
        String path = "/home/user/Documents/../Pictures" ;
        String out = Solution.simplifyPath(path);
        System.out.println(out);
    }
}
