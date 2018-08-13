package AmazonInterviewPrep.LinkedList;

public class LinkedListMain {
    private Node head;
    private int size;

    //Create an inner class Node
    class Node {
        private int data;
        private Node next;

        public Node(int v){
            this.data = v;
        }
    }

    //create a constructor for linked list
    public LinkedListMain(){
        head = null;
        size = 0;
    }

    //is linked list empty
    public boolean isEmpty(){
        return size == 0;
    }

    //get the size
    public int getSize(){
        return size;
    }


    //create a linked list
    public void createLinkedList(){
        head = new Node(1);
        Node second = new Node(2);
        Node third = new Node(3);
        Node fourth = new Node(5);
        Node fifth = new Node(6);
        Node sixth = new Node(6);

        head.next = second;
        second.next = third;
        third.next = fourth;
        fourth.next = fifth;
        fifth.next = sixth;
    }

    //print out the list
    public void printList(){

        if (head == null){
            return ;
        }
        Node current = head;
        while (current != null){
            System.out.print(current.data + " --> ");
            current = current.next;
        }
    }

    //insert item at first
    public void insertItemAtFirst(int v){
        Node newNode = new Node(v);
        if (head == null){
            head = newNode;
        }
        newNode.next = head;
        head = newNode;
    }

    //insert item at end
    public void insertItemAtEnd(int v){
        Node newNode = new Node(v);
        if (head == null){
            head = newNode;
        }
        Node current = head;
        while (current.next != null){
            current = current.next;
        }
        current.next = newNode;
        newNode.next = null;
    }

    //delete item at first
    public void deleteItemAtFirst(){
        if (head == null){
            return ;
        }
        Node current = head;
        head = head.next;
        current.next = null;
    }


    //delete item at end
    public void deleteItemAtEnd(){
        if (head == null){
            return ;
        }
        Node current = head;
        Node previous = null;
        while (current.next != null){
            previous = current;
            current = current.next;
        }
        previous.next = null;
    }


    //remove duplicates
    public void removeDuplicates(){
        if (head == null){
            return ;
        }
        Node current = head;
        while (current.next != null){
            if (current.data == current.next.data){
                current.next = current.next.next;
            } else {
                current = current.next;
            }
        }
    }

    //reverse the linked list
    public void reverseList(){
        if (head == null){
            return ;
        }

        Node current = head;
        Node next = null;
        Node prev = null;
        while (current != null){
            next = current.next;
            current.next = prev;
            prev = current;
            current = next;
        }
        head = prev;
    }

    public void insertNodeAtSortedList(int v){
        Node newNode = new Node(v);
        if (head == null){
            head = newNode;
        }
        Node current = head;
        Node previous = null;
        while (current != null){
            previous = current;
            current = current.next;
        }
        newNode.next = current;
        previous.next = newNode;
    }


    public void deleteItemAtNode(int v){
        Node newNode = new Node(v);
        if (head == null){
            head = newNode;
        }
        Node current = head;
        Node previous = null;
        while (current.next != null && current.data != v){
            previous = current;
            current = current.next;
        }
        previous.next = current.next;
    }

    public static void main(String[] args){
        LinkedListMain list = new LinkedListMain();
        list.createLinkedList();
        list.printList();
        list.insertItemAtFirst(0);
        System.out.println();
        list.printList();
        list.insertItemAtEnd(6);
        System.out.println();
        list.printList();
        list.deleteItemAtFirst();
        System.out.println();
        list.printList();
        list.deleteItemAtEnd();
        System.out.println();
        list.printList();
        list.removeDuplicates();
        System.out.println();
        list.printList();
//        list.reverseList();
//        System.out.println();
//        list.printList();
        list.insertNodeAtSortedList(4);
        System.out.println();
        list.printList();
        list.deleteItemAtNode(3);
        System.out.println();
        list.printList();
    }
}
