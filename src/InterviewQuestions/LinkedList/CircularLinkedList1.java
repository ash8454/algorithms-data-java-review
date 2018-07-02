package InterviewQuestions.LinkedList;

public class CircularLinkedList1 {
    private Node last;
    private int length;

    //Node class
    class Node {
        private int data;
        private Node next;

        public Node(int v){
            this.data = v;
        }
    }

    //Constructor
    public CircularLinkedList1(){
        last = null;
        length = 0;
    }

    private void createCircularLinkedList(){
        Node first = new Node(1);
        Node second = new Node(2);
        Node third = new Node(3);
        Node fourth = new Node(4);

        first.next = second;
        second.next = third;
        third.next = fourth;
        fourth.next = first;

        last = fourth;

    }

    private void traverseList(){
        if (last == null){
            return;
        }
        Node first = last.next;
        while (first != last){
            System.out.print(first.data + " ---> ");
            first = first.next;
        }
        System.out.print(first.data);
    }

    public static void main(String[] args){
        CircularLinkedList1 list = new CircularLinkedList1();
        list.createCircularLinkedList();
        list.traverseList();
    }
}
