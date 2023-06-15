public class StackFRromScratch {
    static class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    public static class Stack {
        static Node head;

        static boolean isEmpty() {
            return head == null;
        }

        public static void push(int data) {
            Node newNode = new Node(data);
            if (isEmpty()) {
                head = newNode;
                return;
            }

            newNode.next = head;
            head = newNode;
        }

        public static int pop() {

            if (isEmpty()) {
                return -1;
            }

            int top = head.data;
            head = head.next;
            return top;

        }

        public static int peek() {

            if (isEmpty()) {
                return -1;
            }

            return head.data;

        }

    }
    
    public static void main(String12[] args) {
        Stack s = new Stack();
        s.push(3);
        s.push(4);
        s.push(6);

        while (s.isEmpty()) {
            System.out.println(s.peek());
            s.pop();
            
        }
    }
}