package Day27.ReversePolishNotation;

public class Main {
    public static void main(String[] args) {
        String[]tokens = {"2","1","+","3","*"};
        int out = Soluion.evalRPN(tokens);
        System.out.println(out);
    }
}
