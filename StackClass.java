public class StackClass {
    public static class Node {
        int data;
        Node next;

        public Node(int data) {
            this.data = data;
            this.next = null;
        }
    }                   
  
    public static class Stack {

        public static Node head;

        public static boolean isEmpty() {

            
            return head == null;

        

        }

        public  void push(int data) {
        
        
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
        s.push(4);        
        s.push(5);        
        s.push(6);        
        s.push(7);        
        s.push(8);        
        s.push(9);        
        s.push(10);        
        s.push(11);
        
        while (!s.isEmpty()) {
            System.out.println(s.peek());
            s.pop();
        }

    }
}
