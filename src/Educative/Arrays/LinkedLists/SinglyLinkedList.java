package Educative.Arrays.LinkedLists;

import InterviewQuestions.LinkedList.SingularLinkedList;

public class SinglyLinkedList {
    //private ListNode head;

    private static class ListNode {
        private int data;
        private ListNode next;

        public ListNode(int data){
            this.data = data;
            this.next = null;
        }
    }

    public void displayList(ListNode head){
        ListNode current = head; //make temporary node equal to head
        //while loop to display date while current node is not null
        while (current != null){
            System.out.print(current.data + "-->");
            current = current.next;
        }
        System.out.println(current);
    }

    public int lengthOfNode(ListNode head){
        ListNode current = head;
        int count = 0; //Initialize it as 0;
        while (current != null){
            count++;
            current = current.next;
        }
        return count;
    }

    //Insert at end
    public ListNode insertAtBeginning(ListNode head, int value){
        ListNode newNode = new ListNode(value); //create new node
        //return newnode if head is null
        if (head == null){
            return newNode;
        }
        newNode.next = head; //make the head as the next element of new node
        head = newNode; //make head as new node
        return head;    //return head
    }

    //Insert Node at end
    public ListNode insertAtEnd(ListNode head, int value){
        ListNode current = head;
        ListNode newNode = new ListNode(value);
        if (head == null){
            return newNode;
        }
        while (current.next != null){
            current = current.next;
        }
        current.next = newNode;
        return head;
    }


    //Insert node between node
    //Node1 --> Node 2 --> Node 4 --> null
    // Inserting new Node --> Node 3 in between Node 2 and Node 4
    //Head Node - Node 1
    //Previous Node - Node 2
    //New Node - Node 4
    //previous.next = newNode
    //newNode.next = previous.next
    //previous.next = newNode;

    //head -> previous -->
    //Node 4 -->
    //
    public void insertNode(ListNode previous, int value){
        if (previous == null){
            System.out.println("Previous node cannot be null");
        }
        ListNode newNode = new ListNode(15);
        newNode.next = previous.next; //point null to previous null
        previous.next = newNode;    //point previous next node to be new node
    }


    //Delete first Node
    public ListNode deleteFirst(ListNode head){
        int length = lengthOfNode(head);
        if (length < 1){
            System.out.println("Invalid Node");
        }
        if (head == null){
            return head;
        }
        head = head.next;
        return head;
    }


    //Delete Last Node
    public ListNode deleteLast(ListNode head){
        if (head == null){
            return null;
        }
        ListNode last = head;
        ListNode previousToLast = null;
        while (last.next != null){
            previousToLast = last;
            last = last.next;
        }
        previousToLast.next = null;
        return head;
    }

    //Delete a node from the given position
    public ListNode deleteAtGivenPosition(ListNode head, int position){
        if (head == null){
            return null;
        }
        ListNode previous = head;
        int count = 1;
        while (count < position - 1){
            previous = previous.next;
            count++;
        }
        //Create current node as the next node
        ListNode current = previous.next;
        previous.next = current.next;
        current.next = null;
        return head;
    }


    //find Node
    public boolean find(ListNode head, int value){
       if (head == null){
           return false;
       }
       ListNode current = head;
       while (current != null){
           if (current.data == value){
               return true;
           }
           current = current.next;
       }
       return false;
    }


    //Reverse a singly linked list
    //1 --> 2 --> 3 --> 4 => 4 --> 3 --> 2 --> 1
    //Assume current = head
    //Assume next = null
    //Assume prev = null
    public ListNode reverseLinkedList(ListNode head) {
        if (head == null){
            return head;
        }
        //Assume current, next and previous
        //get next to current
        //get current.next to previous
        //get previous to current
        //get current to next
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


    //Find Middle Node
    public ListNode findMiddleNode(){
        ListNode slowPtr = null;
        ListNode fastPtr = null;
        while (fastPtr != null && fastPtr.next != null){
            slowPtr = fastPtr.next;
            fastPtr = fastPtr.next.next;
        }
        return slowPtr;
    }

    //Insert Node at a given position
    public ListNode insertNodeAtGivenPosition(ListNode head, int data, int position){
        //Perform boundary checks
        int size = lengthOfNode(head);
        if (position > size + 1 || position < 1){
            System.out.println("Invalid position");
            return head;
        }
        //Create new node
        ListNode newNode = new ListNode(data);

        if (position == 1){
            newNode.next = head;
            head = newNode;
            return head;
        } else {
            ListNode previous = head;
            int count = 1;
            while( count < position - 1){
                previous = previous.next;
                count++;
            }
            ListNode current = previous.next;
            newNode.next = current;
            previous.next = newNode;
            return head;
        }

    }

    public static void main(String[] args){
        // Let's create a linked list demonstrated in slide
        // 10 --> 8 --> 1 --> 11 --> null
        // 10 as head of linked list

        ListNode head = new ListNode(10);
        ListNode secondNode = new ListNode(8);
        ListNode thirdNode = new ListNode(1);
        ListNode fourthNode = new ListNode(11);

        //Attach them together to form a list
        head.next = secondNode; // 10 --> 8
        secondNode.next = thirdNode; // 10 --> 8 --> 1
        thirdNode.next = fourthNode; // 10 --> 8 --> 1 --> 11 --> null

        SinglyLinkedList singlyLinkedList = new SinglyLinkedList();
        //print the list
        singlyLinkedList.displayList(head);
        System.out.println(singlyLinkedList.lengthOfNode(head));
        System.out.println();
        //Insert node at beginning
        ListNode newHead = singlyLinkedList.insertAtBeginning(head, 14);
        //print the list
        singlyLinkedList.displayList(newHead);
        ListNode newListNode = singlyLinkedList.insertAtEnd(head, 16);
        //print the list
        singlyLinkedList.displayList(newListNode);
        singlyLinkedList.insertNode(thirdNode, 15);
        singlyLinkedList.displayList(head);
        singlyLinkedList.insertNodeAtGivenPosition(head, 12, 3);
        singlyLinkedList.displayList(head);
        head = singlyLinkedList.deleteFirst(head);
        singlyLinkedList.displayList(head);
        head = singlyLinkedList.deleteLast(head);
        singlyLinkedList.displayList(head);
        head = singlyLinkedList.deleteAtGivenPosition(head, 3);
        singlyLinkedList.displayList(head);
        System.out.println(singlyLinkedList.find(head, 13));
        ListNode reverseNode = singlyLinkedList.reverseLinkedList(head);
        singlyLinkedList.displayList(reverseNode);
        ListNode middleNode = singlyLinkedList.findMiddleNode();
        System.out.println(middleNode.data);


    }

}
