package Day14.SimplifyPath;

public class main {
    public static void main(String[] args) {
        String input = "/a/./b/../../c/";
        String out = Solution.simplifyPath(input);
        System.out.println(out);
    }
}
