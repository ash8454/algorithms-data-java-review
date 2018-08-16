package Educative.Arrays.LinkedLists;

import java.util.List;

public class SingleLinkedList {
    public static class ListNode {
        private int data;
        private ListNode next;

        public ListNode(int data){
            this.data = data;
            this.next = null;
        }
    }


    //Insert node at beginning
    public static ListNode insertAtBeginning(ListNode head, int v){
        ListNode newNode = new ListNode(v);
        if (head == null){
            return newNode;
        }
        newNode.next = head;
        head = newNode;
        return head;
    }

    //Insert node at end
    public static ListNode insertAtEnd(ListNode head, int v){
        ListNode newNode = new ListNode(v);
        if (head == null){
            return newNode;
        }
        //create current node
        ListNode current = head;
        //while loop until current.next = null
        while(current.next != null){
            current = current.next;
        }
        current.next = newNode;
        return head;
    }

    //find length of the linkedlist
    public static int length(ListNode head){
        if (head == null){
            return 1;
        }
        ListNode current = head;
        int count = 0;
        while (current != null){
            current = current.next;
            count++;
        }
        return count;
    }

    //Insert node at given position
    public static ListNode insertNodeAfter(ListNode previous, int v)
    {
       if (previous == null){
           System.out.println("Cannot insert node ");
       }
       ListNode newNode = new ListNode(v);
       newNode.next = previous.next;
       previous.next = newNode;
       return previous;
    }



    //Delete node first
    public static ListNode deleteAtFirst(ListNode head){
        if (head == null){
            return null;
        }
        head = head.next;
        return head;
    }

    //Delete at last
    public static ListNode deleteAtLast(ListNode head){
        if (head == null){
            return null;
        }
        ListNode last = head;
        ListNode prevToLast = null;
        //while loop until last != null
        while (last.next != null){
            prevToLast = last;
            last = last.next;
        }
        prevToLast.next = null;
        return head;
    }

    //Delete at given position
    public static ListNode deleteAtGivenPosition(ListNode head, int position){
        if (head == null){
            return null;
        }
        ListNode previous = head;
        int count = 1;
        while (count < position - 1){
            previous = previous.next;
            count++;
        }
        ListNode current = previous.next;
        previous.next = current.next;
        current.next = null;
        return head;



    }

    //find node
    public static boolean findNode(ListNode head, int v){
        if (head == null){
            return false;
        }
        ListNode current = head;
        while (current != null){
            if (current.data == v){
                return true;
            }
            current = current.next;
        }
        return false;
    }


    //Reverse linked list
    public static ListNode reverseNode(ListNode head){
        if (head == null){
            return null;
        }
        //Get the node as current, next and previous
        ListNode current = head;
        ListNode next = null;
        ListNode previous = null;
        while (current != null){
            next = current.next;
            current.next = previous;
            previous = current;
            current = next;
        }
        return previous;
    }


    //display the list
    public static void displayList(ListNode head){
        //return null if head == null
        if (head == null){
            return ;
        }
        //Initialize current node as head
        ListNode current = head;
        //Perform while loop and print the data
        while (current != null){
            System.out.print(current.data + "-->");
            current = current.next;
        }
        System.out.println(current);
    }


    //detect loop
    public static boolean detectLoop(ListNode head){
        ListNode slowPtr = head;
        ListNode fastPtr = head;
        while (slowPtr != null && fastPtr != null && fastPtr.next != null) {
            slowPtr = slowPtr.next;
            fastPtr = fastPtr.next.next;
            if (slowPtr == fastPtr){
                return true;
            }
        }
        return false;
    }

    //remove duplicates
    public static void removeDuplicates(ListNode head){
        if (head == null){
            return ;
        }
        ListNode current = head;
        while (current.next != null){
            if (current.data == current.next.data){
                current.next = current.next.next;
            } else {
                current = current.next;
            }
        }
    }



    public static void main(String[] args) {
        ListNode head = new ListNode(2);
        ListNode second = new ListNode(4);
        ListNode third = new ListNode(6);
        ListNode fourth = new ListNode(8);
        ListNode fifth = new ListNode(8);
        head.next = second;
        second.next = third;
        third.next = fourth;
        fourth.next = fifth;

        //create object
        SingleLinkedList singly = new SingleLinkedList();
        singly.displayList(head);
        ListNode newHead = singly.insertAtBeginning(head, 1);
        singly.displayList(newHead);
//        ListNode newHead2 = singly.insertAtEnd(head, 9);
//        singly.displayList(newHead2);
        System.out.println(length(newHead));
//        ListNode head2 = new ListNode(3);
//        System.out.println("Length is: " + length(head2));
//        ListNode head3 = singly.insertNodeAfter(head, 3);
//        singly.displayList(head3);
//        ListNode head4 = singly.deleteAtFirst(head);
//        singly.displayList(head4);
//        ListNode head5 = singly.deleteAtLast(head);
//        singly.displayList(head5);
//        System.out.println(singly.findNode(head, 4));
//        ListNode head6 = singly.deleteAtGivenPosition(head, 2);
//        singly.displayList(head6);
//        ListNode head7 = singly.reverseNode(head);
//        singly.displayList(head7);
//        System.out.println(singly.detectLoop(head));
        singly.removeDuplicates(head);
        singly.displayList(head);


    }
}
