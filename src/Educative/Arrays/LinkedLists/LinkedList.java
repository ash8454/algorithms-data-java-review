package Educative.Arrays.LinkedLists;

public class LinkedList {
    Node headNode;

    LinkedList(){
        headNode = new Node();
    }


    //Basic Operations
    //InsertAtEnd(data) - Inserts an element at the end of the linkedlist
    //InsertAtHead(data) - Inserts an element at the start/head of linkedlist
    //Delete (data) - deletes an element from the linked list
    //DeleteAtHead() - deletes first element of the list
    //Search (data) - searches an element from the linked list
    //isEmpty() - returns True if linked list is empty otherwise returns false

    //Insertion at head
    public void insertAtHead(int value){
        Node newNode = new Node();
        newNode.data = value;
        newNode.nextElement = headNode.nextElement; //Linking new node to head's next element
        headNode.nextElement = newNode;
        System.out.println(value + " Inserted !");
        printList(); //print list
    }

    public static String deleteAtHead(LinkedList list) {

        Node head = list.headNode;
        if (head.nextElement != null){
            head.nextElement = head.nextElement.nextElement;
        }

        // Write - Your - Code
        return elements(list);
    }

    public static int length(LinkedList list){

        // Write - Your - Code
        Node headNode = list.headNode;
        if (headNode.nextElement == null){
            return 0;
        }

        int count= 0;
        while (headNode.nextElement != null){
            headNode.nextElement = headNode.nextElement.nextElement;
            count++;
        }
        return count;
    }

    public static String reverse(LinkedList list) {
        //4 --> 3 --> 2 --> 1
        //headNode = list.headNode
        //prevNode = null;
        //nextNode = null;
        //while headNode.nextElement ! = null
           //next = curr.next;
           //curr.next = prev;
           // prev = curr;
           // curr = next;

        Node headNode = list.headNode;
        if (headNode.nextElement == null){
            return elements(list);
        }
        Node next = null;
        Node prev = null;
        while (headNode.nextElement != null){
            next = headNode.nextElement;
            headNode.nextElement = prev;
            prev = headNode;
            headNode = next;
        }
        headNode.nextElement = prev;
        return elements(list);
    }

    public static boolean searchNode(LinkedList list, int value){
        Node current = list.headNode;
        while (current != null){
            if (current.data == value){
                return true;
            }
            current = current.nextElement;
        }
        // Write - Your - Code
        return false;
    }

    //Insertion at head
    public String insertAtEnd(LinkedList list, int value){
        Node newNode = new Node();
        newNode.data = value;
        //Start from head node;
        Node current = list.headNode;
        if (current.nextElement == null){
            current.nextElement = newNode;
            return elements(list);
        }
        while (current.nextElement != null){
            current = current.nextElement;
        }
        current.nextElement = newNode;
        return elements(list);
    }

    public static boolean detectLoop(LinkedList list){
        boolean isLoop = false;
        Node slowPtr = null;
        Node fastPtr = null;
        while (slowPtr != null && fastPtr != null && fastPtr.nextElement != null){
            slowPtr = slowPtr.nextElement;
            fastPtr = fastPtr.nextElement.nextElement;
            if (slowPtr == fastPtr){
                isLoop = true;
                return isLoop;
            }
        }
       return isLoop;
    }

    //Helper Function to convert List elements in a single string
    public static String elements(LinkedList list) {

        String elementsList = "";

        Node start = list.headNode.nextElement;

        while (start != null) {
            elementsList += start.data;
            elementsList += "->";
            start = start.nextElement;
        }

        elementsList += "null";

        return elementsList;
    }

//
//    InterviewQuestions.LinkedList.Node current = head;
//        while (current.next != null){
//        current = current.next;
//    }
//    current.next = newNode;
//        return head;

    //Helper function to check if list is empty or not
    public boolean isEmpty() {
        if (headNode.nextElement == null) return true;
        return false;
    }

    //Helper function to print list
    public boolean printList() {
        if (isEmpty()) {
            System.out.println("List is empty");
            return false;
        }

        Node temp = headNode.nextElement;
        System.out.print("List: ");

        while(temp.nextElement != null){
            System.out.print(temp.data + "->");
            temp = temp.nextElement;
        }
        System.out.println(temp.data + "--> null");
        return true;
    }

    public static void main(String args[]){
        LinkedList list = new LinkedList();
        list.printList();
        for(int i=0; i<=10; i++){
            list.insertAtHead(i);
        }
        list.insertAtEnd(list, 11);
        list.printList();
        System.out.println(list.length(list));

    }


}
