package Educative.Arrays.LinkedLists;

import java.util.NoSuchElementException;

public class DoublyLinkedList {
    private ListNode head; //first node of the double linked list
    private ListNode tail; //last node of the double linked list
    private int length; //number of node in double linked list

    private static class ListNode {
        private int data;
        private ListNode next;
        private ListNode previous;

        public ListNode(int data){
            this.data = data;
            //this.next = null;
        }
    }

    //constructor
    public DoublyLinkedList(){
        this.head = null;
        this.tail = null;
        this.length = 0;
    }

    //is empty
    public boolean isEmpty(){
        return length == 0; //or head == null
    }

    //length of doubly linked list
    public int length(){
        return length;
    }

    //Insert elements at first
    public void insertFirst(int value){
        ListNode newNode = new ListNode(value);
        if (isEmpty()){
            tail = newNode;
        } else {
            head.previous = newNode;
        }
        newNode.next = head;
        head = newNode;
        length++;
    }

    //insert elements at last
    public void insertLast(int value){
        ListNode newNode = new ListNode(value);
        if (isEmpty()){
            head = newNode;
        } else {
            tail.next = newNode;
        }
        newNode.previous = tail;
        tail = newNode;
        length++;
    }

    //print the elements from the list from forward
    public void displayList(){
        if (head == null){
            return;
        }
        ListNode temp = head;
        while (temp != null){
            System.out.print(temp.data + "-->");
            temp = temp.next;
        }
        System.out.println("null");
    }


    //print the elements from the list in backward direction
    public void displayListFromTail(){
        if (tail == null){
            return;
        }
        ListNode temp = tail;
        while (temp != null){
            System.out.print(temp.data + "-->");
            temp = temp.previous;
        }
        System.out.println("null");
    }


    //Delete first from the Linked List
    public ListNode deleteFirst(){
        if (isEmpty()){
            throw new NoSuchElementException();
        }
        ListNode temp = head;
        if (head == tail){
            tail = null;
        } else {
            head.next.previous = null;
        }
        head = head.next;
        temp.next = null;
        length--;
        return temp;
    }

    //Delete first from the Linked List
    public ListNode deleteLast(){
        if (isEmpty()){
            throw new NoSuchElementException();
        }
        ListNode temp = tail;
        if (head == tail){
            head = null;
        } else {
            tail.previous.next = null;
        }
        tail = tail.previous;
        temp.previous = null;
        length--;
        return temp;
    }
    public static void main(String[] args){
        ListNode head = new ListNode(2);

        //third.previous = second;

        DoublyLinkedList doubly = new DoublyLinkedList();
        doubly.insertLast(3);
        doubly.insertLast(5);
        doubly.insertLast(7);
        doubly.insertFirst(2);
        doubly.displayList();
        doubly.displayListFromTail();
        doubly.deleteFirst();
        doubly.displayList();
        doubly.deleteLast();
        doubly.displayList();
    }
}
