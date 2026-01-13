package Day24.MinStack;

public class Main {

    public static void main(String[] args) {

        MinStack obj = new MinStack();

        obj.push(5);
        obj.push(3);
        obj.push(7);
        obj.push(2);

        System.out.println("Top element: " + obj.top());
        System.out.println("Minimum element: " + obj.getMin());

        obj.pop();

        System.out.println("Top after pop: " + obj.top());
        System.out.println("Min after pop: " + obj.getMin());
        System.out.println("---------------------------optimised Version ----------------------------------");
        MinStack2 obj2 = new MinStack2();

        obj2.push(5);
        obj2.push(3);
        obj2.push(7);
        obj2.push(2);

        System.out.println("Top element: " + obj2.top());
        System.out.println("Minimum element: " + obj2.getMin());

        obj2.pop();

        System.out.println("Top after pop: " + obj2.top());
        System.out.println("Min after pop: " + obj2.getMin());
    }
}

