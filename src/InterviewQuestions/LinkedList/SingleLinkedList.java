package InterviewQuestions.LinkedList;

//Create a single linked list node
class Node {
    int value;
    Node next;

    public Node(int v){
        this.value = v;
        next = null;
    }
}
public class SingleLinkedList {
//    Node head;
//    public SingleLinkedList(){
//        head = null;
//    }

    //Display each node value
    public Node printList(Node head){

        Node current = head; //start the current as head
        //while loop and display each value after every node
        while(current != null){
            System.out.print(current.value + " ---> ");
            current = current.next;
        }
        System.out.println(current);
        return head;

    }

    //Insert Node at first
   public Node insertNodeAtFirst(Node head, int v){
        Node newNode = new Node(v);
        if (head == null){
            return newNode;
        }

        Node current = head;
        newNode.next = current;
        head = newNode;
        return head;

   }

    //Insert Node at end
    public Node insertNodeAtEnd(Node head, int v){
        Node newNode = new Node(v);
        if (head == null){
            return newNode;
        }

        Node current = head;
        while (current.next != null){
            current = current.next;
        }
        current.next = newNode;
        return head;
    }


    //Insert Node after given node
    public void insertNodeAfter(Node prev, int v){
       Node newNode = new Node(v);
       if (prev == null){
           System.out.println("Can't insert into any node");
       }

       newNode.next = prev.next;
       prev.next = newNode;

    }


    public Node deleteAtFirst(Node head){
        if (head == null){
            return head;
        }
        Node temp = head;
        head = head.next;
        temp.next = null;
        return head;

    }


    public Node deleteNodeAtLast(Node head) {
        if (head == null) {
            return head;
         }
            //
         Node last = head;
         Node previous = null;

         while (last.next != null){
             previous = last;
            last = last.next;
         }

         previous.next = null;
         return last;
        }


     public boolean searchKey(Node head, int v){
        if (head == null){
            return false;
        }

        Node current = head;
        while (current != null){
            if (current.value == v){
                return true;
            }
            current = current.next;
        }

        return false;
     }

     public Node reverseNode(Node head){
        if (head == null){
            return head;
        }
        Node current = head;
        Node prev = null;
        Node next = null;
        while (current != null){
            next = current.next;
            current.next = prev;
            prev = current;
            current = next;
        }
        return prev;
     }

     public Node getMiddleNode(Node head) {
       if (head == null){
           return head;
       }
       Node slowPtr = head;
       Node fastPtr = head;
       while (fastPtr != null && fastPtr.next != null){
           slowPtr = slowPtr.next;
           fastPtr = fastPtr.next.next;
       }
       return slowPtr;
     }

     public void removeDuplicates(Node head){
        if (head == null){
            return;
        }
        Node current = head;
        while (current != null && current.next != null){
            if (current.value == current.next.value){
                current.next = current.next.next;
            } else {
                current = current.next;
            }
        }
     }

     public Node inertNodeAtSortedLinkedList(Node head, int v){
        Node newNode = new Node(v);
        if (head == null){
            return newNode;
        }
        Node current = head;
        Node temp = null;
        while (current != null && current.value < newNode.value){
            temp = current;
            current = current.next;
        }
        newNode.next = current;
        temp.next = newNode;
        return head;
     }

     public boolean findLoop(Node head){
        Node slowPtr = head;
        Node fastPtr = head;
        while (fastPtr != null && fastPtr.next != null){
            slowPtr = slowPtr.next;
            fastPtr = fastPtr.next.next;
            if (slowPtr == fastPtr){
                return true;
            }
        }
        return false;


     }




    public static void main(String[] args){
        Node head = new Node(5);
        Node second = new Node(6);
        Node third = new Node(8);
        Node fourth = new Node(9);
        Node fifth = new Node(10);
        Node sixth = new Node(10);



        //now link each node
        head.next = second;
        second.next = third;
        third.next = fourth;
        fourth.next = fifth;
        fifth.next = sixth;
        //sixth.next = third;

        //Display each node
        SingleLinkedList list = new SingleLinkedList();
//        list.insertNodeAtFirst(head, 10);
//        list.insertNodeAtFirst(head, 11);

        list.printList(head);
//        list.displayNode(head);
//        Node first = list.insertNodeAtFirst(head, 4);
//        list.printList(first);
//        Node last = list.insertNodeAtEnd(head, 10);
//        list.printList(last);
//        Node last = list.insertNodeAtEnd(head, 9);
//        list.displayNode(last);
//       list.insertNodeAfter(second, 7);
//        list.printList(head);
//        Node firstNode =  list.deleteAtFirst(head);
//        list.printList(firstNode);
//       Node lastNode = list.deleteNodeAtLast(head);
//       System.out.println(lastNode.value);
//       System.out.println(list.searchKey(head, 8));
//       Node reversedNodeList = list.reverseNode(head);
//       list.printList(reversedNodeList);
       Node middleNode = list.getMiddleNode(head);
       System.out.println(middleNode.value);
       list.removeDuplicates(head);
       list.printList(head);
       Node sortedNode = list.inertNodeAtSortedLinkedList(head, 7);
       list.printList(sortedNode);
       System.out.println(list.findLoop(head));
       // System.out.println(last.value);

    }
}
