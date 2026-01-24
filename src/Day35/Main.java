package Day35;

public class Main {
    public static void main(String[] args) {
       char[]chars = {'A','A','A','B','B','B'};
       int out =  TaskScheduler.leastInterval(chars , 2);
        System.out.println(out);
    }
}
