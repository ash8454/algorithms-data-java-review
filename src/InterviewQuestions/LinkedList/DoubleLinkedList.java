package InterviewQuestions.LinkedList;

public class DoubleLinkedList {

    private Node head;
    private Node tail;
    private int size = 0;


    class Node {
        private int data;
        Node next;
        Node previous;

        public Node(int v){
            this.data = v;
        }
    }

    public DoubleLinkedList(){
        this.head = null;
        this.tail = null;
        this.size = 0;

    }

    private boolean isEmpty(){
        return size == 0;
    }

    private int countLength() {
        return size;
    }

    private void printNodeForward(){
        if (head == null){
            return;
        }
        Node current = head;
        while (current != null){
            System.out.print(current.data + "--> ");
            current = current.next;
        }
        System.out.print(current);
    }

    private void printNodeBackward(){
        if (tail == null){
            return;
        }
        Node temp = tail;
        while (temp != null){
            System.out.print(temp.data + " --> ");
            temp = temp.previous;
        }
        System.out.print("Null");
    }


    private void insertLast(int v){
        Node newNode = new Node(v);
        if (isEmpty()){
            head = newNode;
        } else {
            tail.next = newNode;
        }
        newNode.previous = tail;
        tail = newNode;
        size++;
    }

    private void insertNodeAtFirst(int v){
        Node newNode = new Node(v);
        if (isEmpty()) {
            tail = newNode;
        }  else {
            head.previous = newNode;
        }
        newNode.next = head;
        head = newNode;





    }

    private void insertNodeAtLast(int v){
        Node newNode = new Node(v);
        if (head == null){
            head = newNode;
        } else {
            tail.next = newNode;
            newNode.previous = tail;
        }
        tail = newNode;




    }


    public static void main(String[] args){
        DoubleLinkedList doublyList = new DoubleLinkedList();
        doublyList.insertLast(5);
        doublyList.insertLast(6);
        doublyList.insertLast(8);
        doublyList.insertLast(9);
        //doublyList.printNodeForward();
       // doublyList.printNodeBackward();
        doublyList.insertNodeAtFirst(4);
        doublyList.printNodeBackward();
        System.out.println();
        doublyList.printNodeForward();
        doublyList.insertNodeAtLast(10);
        System.out.println();
        doublyList.printNodeForward();



    }
}
