//package InterviewQuestions.LinkedList;
//
//class Node {
//
//    int iData; //data item
//    Node next; //next Link in list
//
//    public Node(int id){
//        iData = id;
//        next = null;
//    }
//
//}
//
//class LinkedList {
//    private Node head;
//    private int size = 0;
//
//    public LinkedList() {
//        head = null;
//    }
//
//    public Node reverseNode(Node head){
//        if (head == null){
//            return head;
//        }
//        Node curr = head;
//        Node next = null;
//        Node prev = null;
//        while (curr != null){
//            next = curr.next;
//            curr.next = prev;
//            prev = curr;
//            curr = next;
//        }
//        return prev;
//    }
//
//    //print list
//    public void printList() {
//        Node curr = head;
//        while (curr != null){
//            System.out.print(curr.iData + " ");
//            curr = curr.next;
//        }
//    }
//
//    public void push(int val){
//        Node newNode = new Node(val);
//        newNode.next = head;
//        head = newNode;
//    }
//
//    void deleteNode(int key){
//        Node curr = head, prev = null;
//        if (curr != null && curr.iData == key){
//            head = curr.next;
//            return;
//        }
//
//        while (curr != null && curr.iData != key){
//            prev = curr;
//            curr = curr.next;
//        }
//
//        if (curr == null) return;
//
//        prev.next = curr.next;
//    }
//
//    boolean findKey(int key){
//        Node curr = head;
//        boolean found = false;
//
//        while (curr != null && curr.iData != key){
//            curr = curr.next;
//        }
//
//        if (curr != null && curr.iData == key){
//            found = true;
//        }
//
//        if (curr == null) found = false;
//        return found;
//    }
//
//    void printReverse(){
//        Node curr = head, prev = null, next = null;
//
//        while (curr != null){
//            next = curr.next; //make next as current next
//            curr.next = prev;  //make curr next as previous
//            prev = curr; //now make prev as curr node;
//            curr = next; //Then make curr as next node
//        }
//        head = prev;
//        printList();
//    }
//
//    int size(){
//        return size;
//    }
//
//    public boolean isEmpty(){
//        return (size == 0);
//    }
//
//    //Add item at first
//    void addItemAtFirst(int v){
//        //create new node
//        Node newNode = new Node(v);
//        newNode.next = head; //equate next element as head
//        head = newNode;
//    }
//
//    void addItemAtEnd(int v){
//        //CREATE NEW NODE
//        Node newNode = new Node(v);
//
//        Node curr = head;
//
//        //add node if no element
//        if (curr == null){
//            newNode = head;
//        }
//
//        //while looop until the last element
//        while (curr.next != null){
//            curr = curr.next;
//        }
//
//        curr.next = newNode; //add element at last
//    }
//
//    void removeDuplicates(int v){
//        Node curr = head;
//        if (curr == null){
//            curr = new Node(v);
//        }
//
//        while (curr.next != null){
//            if (v == curr.next.iData){
//                curr.next = curr.next.next;
//            } else {
//                curr = curr.next;
//            }
//        }
//    }
//
//    void reverseArray(){
//       Node curr = head, prev = null, next = null;
//       while (curr.next != null){
//           //make next as curr.next
//           next = curr.next;
//           curr.next = prev; //make currnext as previous
//           prev = curr;
//           curr = next;
//       }
//       head = prev;
//       printList();
//    }
//
//
//}
//
//public class LinkedList1 {
//    public static void main(String[] args){
//        LinkedList list = new LinkedList();
//        list.push(1);
//        list.push(5);
//        list.push(7);
//        list.push(8);
//        list.printList();
//        System.out.println();
////        list.printReverse();
////        System.out.println();
//        list.addItemAtFirst(2);
//        System.out.println("Finally");
//        list.printList();
//        System.out.println();
//        list.addItemAtEnd(3);
//        System.out.println("Finally");
//        list.printList();
//        System.out.println();
//        list.deleteNode(2);
//        list.findKey(7);
//        list.removeDuplicates(5);
//    }
//}
