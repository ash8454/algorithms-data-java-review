package InterviewQuestions.LinkedList;

public class Stack {
    private Node top;
    private int length;

    class Node {
        private int data;
        private Node next;

        public Node(int v){
            this.data = v;
        }
    }

    public Stack(){
        top = null;
        length = 0;
    }

    private boolean isEmpty(){
        return length == 0;
    }

    private int findLength(){
        return length;
    }


    // 1- top newNode
    private void push(int v){
        Node newNode = new Node(v);
        newNode.next = top;
        top = newNode;
        length++;
    }

    private int pop(){
        int result = top.data;
        top = top.next;
        length--;
        return result;
    }

    public static void main(String[] args){
        Stack stack = new Stack();
        stack.push(2);
        stack.push(3);
        System.out.println(stack.length);
        System.out.println(stack.pop());
        System.out.println(stack.length);
    }
}
