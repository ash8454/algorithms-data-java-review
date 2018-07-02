package InterviewQuestions.LinkedList;

public class SingularLinkedList {
    private Node head;
    private int length;
    class Node {
        private int data;
        private Node next;

        public Node(int v){
            this.data = v;
        }
    }


    public SingularLinkedList(){
        head = null;
        length = 0;
    }

    private boolean isEmpty(){
        return length == 0;
    }

    private int size(){
        return length;
    }

    public void createLinkedList(){
        head = new Node(1);
        Node second = new Node(2);
        Node third = new Node(4);
        Node fourth = new Node(5);

        head.next = second;
        second.next = third;
        third.next = fourth;

    }




    //Traverse through the linked list
    public void printList(){
       if (head == null){
           return;
       }
       Node current = head;
       while (current != null){
           System.out.print(current.data + " --> ");
           current = current.next;
       }
       System.out.print(current);
    }

    public void insertItemAtFirst(int v){
        Node newNode = new Node(v);
        if (head == null){
            head = newNode;
        }
        newNode.next = head;
        head = newNode;
    }

    public void insertItemAtEnd(int v){
        Node newNode = new Node(v);
        if (head == null){
            head =newNode;
        }
        Node current = head;
        while (current.next != null){
            current = current.next;
        }
        current.next = newNode;
    }

    public void reverseList(){
        Node current = head;
        if (head == null){
            return ;
        }
        Node prev = null;
        Node next = null;

        while (current != null){
            next = current.next;
            current.next = prev;
            prev = current;
            current = next;
        }

        head = prev;
    }

    public void removeDuplicates(){
        if (head == null){
            return;
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


    public boolean findNode(int v){
        if (head == null){
            return false;
        }
        Node current = head;
        while (current != null){
            if (current.data == v){
                return true;
            }
            current = current.next;
        }
        return false;
    }


    public void deleteNodeAtEnd(){
        if (head == null){
            return ;
        }
        Node current = head;
        Node prev = null;
        while (current.next != null){
            prev = current;
            current = current.next;
        }
        prev.next = current.next;

    }


    public void deleteNodeAtFirst(){
        if (head == null){
            return;
        }
        Node current = head;
        head = head.next;
        current.next = null;

    }

    public void deleteNodeAtLast() {
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

    public void deleteNodeAtGivenValue(int v){
        if (head == null){
            return ;
        }
        Node current = head;
        Node previous = null;
        while (current != null & current.data != v){
               previous = current;
               current = current.next;
        }
        previous.next = current.next;
    }


    public void removeDuplicatesAgain(){
        if (head == null){
            return ;
        }
        Node current = head;
        while (current.next != null){
            if (current.data  == current.next.data){
                current.next = current.next.next;
            } else {
                current = current.next;
            }
        }
    }

    public int findLength(){
        if (head == null){
            return 0;
        }
        int count = 0;
        Node current = head;
        while (current != null){
            current = current.next;
            count++;
        }
        return count;
    }

    public void insertItemAtSortedList(int v){
        Node newNode = new Node(v);
        if (head == null){
            head = newNode;
        }

        Node current = head;
        Node temp = null;
        while (current != null && current.data < v){
            temp = current;
            current = current.next;
        }
        newNode.next = current;
        temp.next = newNode;
    }


    public static void main(String[] args){
        SingularLinkedList list = new SingularLinkedList();
        list.createLinkedList();
//        list.printList();
//        list.insertItemAtFirst(0);
//        System.out.println();
//        list.printList();
//        System.out.println();
//        list.insertItemAtEnd(5);
//        list.printList();
//        list.reverseList();
//        System.out.println();
//        list.printList();
//        System.out.println();
//        list.insertItemAtFirst(5);
//        list.printList();
//        list.removeDuplicates();
//        System.out.println();
//        list.printList();
//        System.out.println();
//        System.out.println(list.findNode(4));
//        list.deleteNodeAtEnd(); //need review
//        System.out.println();
//        list.printList();
//        list.deleteNodeAtFirst(); //need review
//        System.out.println();
//        list.printList();
//        System.out.println();
//        list.deleteNodeAtLast();
//        list.printList();
//        System.out.println();
//        list.deleteNodeAtGivenValue(3);
//        list.printList();
//        list.insertItemAtFirst(5);
//        list.insertItemAtFirst(5);
//        System.out.println();
//        list.printList();
//        System.out.println();
//        list.removeDuplicatesAgain();
//        list.printList();
//        System.out.println();
//        System.out.println(list.findLength());
//        System.out.println();
        list.insertItemAtSortedList(3);
        list.printList();


    }


}
