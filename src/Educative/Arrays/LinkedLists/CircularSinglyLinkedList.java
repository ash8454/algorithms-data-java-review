package Educative.Arrays.LinkedLists;

import java.util.NoSuchElementException;

public class CircularSinglyLinkedList {
    private ListNode last;
    private int length;

    private class ListNode {
        private int data;
        private ListNode next;
        public ListNode(int v){
            this.data = v;
        }
    }

    public CircularSinglyLinkedList() {
        last = null;
        length = 0;
    }

    //check if it is empty
    public boolean isEmpty(){
        return length == 0;
    }

    //length
    public int length(){
        return length;
    }

    //create circular linked list
    public void createCircularLinkedList(){
        ListNode first = new ListNode(1);
        ListNode second = new ListNode(5);
        ListNode third = new ListNode(10);
        ListNode fourth = new ListNode(15);
        first.next = second;
        second.next = third;
        third.next = fourth;
        fourth.next = first;
        last = fourth;
    }

    //print list
    public void printList(){
        if (last == null){
            return;
        }
        ListNode first = last.next;
        while (first != last){
            System.out.print(first.data + " ");
            first = first.next;
        }
        System.out.print(first.data + " ");
    }

    //insert node at beginning
    public void insertNodeAtBeginning(int v){
        ListNode newNode= new ListNode(v);
        if (last == null){
            last = newNode;
        } else {
            newNode.next = last.next;
            last.next = newNode;
            length++;
        }
    }

    //insert node at end
    public void insertNodeAtEnd(int v){
        ListNode newNode= new ListNode(v);
        ListNode prevToLast = null;
        if (last == null){
            last = newNode;
            last.next = last; //since it is only one node, the last should refer to last itlself
        } else {
            newNode.next = last.next;
            last.next = newNode;
            last = newNode;
        }
        length++;
    }

    //remove first node
    public ListNode removeFirstNode(){
        if (isEmpty()){
            throw new NoSuchElementException();
        }
        ListNode temp = last.next;
        if (last.next == last){
            last = null;
        } else {
            last.next = temp.next;
        }
        temp.next = null;
        length--;
        return temp;
    }

    //detect a loop


    public static void main(String[] args){
        CircularSinglyLinkedList circular = new CircularSinglyLinkedList();
        circular.createCircularLinkedList();
        circular.printList();
        circular.insertNodeAtBeginning(2);
        System.out.println("");
        circular.printList();
        circular.insertNodeAtEnd(18);
        System.out.println("");
        circular.printList();
        circular.removeFirstNode();
        System.out.println("");
        circular.printList();
    }
}
