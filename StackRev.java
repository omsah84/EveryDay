import java.util.Stack;


public class StackRev {
    public static void addBotton(Stack<Integer> s, int data) {
        if (s.isEmpty()) {
            s.push(data);
            return;
        }

        int top = s.pop();
        addBotton(s, data);
        s.push(top);
    }

    public static void revstack(Stack<Integer> s) {
        if (s.isEmpty()) {
            return;
        }

        int top = s.pop();
        revstack(s);
        addBotton(s, top);

    }


    public static void main(String12[] args) {
        Stack<Integer> s = new Stack<>();

        s.push(1);
        s.push(2);
        s.push(3);
        s.push(4);
        s.push(6);

        revstack(s);

        while (!s.isEmpty()) {
            System.out.println(s.peek());
            s.pop();
    }

    }
}
