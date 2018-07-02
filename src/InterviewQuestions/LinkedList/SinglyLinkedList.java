//package InterviewQuestions.LinkedList;
//
//import java.util.List;
//
//class ListNode {
//    int data;
//    ListNode next;
//
//    public ListNode(int v){
//        this.data = v;
//        this.next = null;
//    }
//}
//public class SinglyLinkedList {
//
//    //static ListNode head; //Head node to hold the list
//
//    //print out the linked list;
//    public void display(ListNode head) {
//         if (head == null){
//             return;
//         }
//
//         ListNode current = head;
//         while (current != null){
//             System.out.print(current.data + " --> ");
//             current = current.next;
//         }
//         System.out.print(current);
//    }
//
//    //find length of linked list
//    public int findLength(ListNode head){
//        if (head == null){
//            return 0;
//        }
//
//        ListNode current = head;
//        int count = 0;
//        while (current != null){
//            count++;
//            current = current.next;
//        }
//        return count;
//    }
//
//    //Insert Node in the linked list
//    public ListNode insertNodeAtFirst(ListNode head, int data){
//        ListNode newNode = new ListNode(data);
//        if (head == null){
//            return newNode;
//        }
//        newNode.next = head; //pointer to the head
//        head = newNode; //make NewNode as head;
//        return head; //return head;
//    }
//
//    //Insert Node in the linked list
//    public ListNode insertNodeAtEnd(ListNode head, int data) {
//
//        ListNode newNode = new ListNode(12);
//        ListNode current = head;
//        while (current.next != null){
//            current = current.next;
//        }
//        current.next = newNode;
//        return head;
//
//    }
//
//    //Insert after given node
//    public void insertAfter(ListNode previous, int data){
//       if (previous == null){
//           return ;
//       }
//       ListNode newNode = new ListNode(data);
//       //prev(val) -> // new node -next
//       newNode.next = previous.next;
//       previous.next = newNode;
//    }
//
//
//    public static void main(String[] args){
//        SinglyLinkedList list = new SinglyLinkedList();
//        ListNode head = new ListNode(10);
//        ListNode second = new ListNode(11);
//        ListNode third = new ListNode(1);
//        ListNode fourth = new ListNode(11);
//
//        //Attach them together to form list
//        head.next = second; // 10 --> 8
//        second.next = third;
//        third.next = fourth;
//
//        //print elements of linked list
//
//        list.display(head);
//        System.out.println();
//        System.out.println("Length is: " + list.findLength(head));
//        ListNode newHead = list.insertNodeAtFirst(head, 15);
//        list.display(newHead);
//        System.out.println();
//        newHead = list.insertNodeAtEnd(head, 12);
//        list.display(newHead);
//        newHead = list.insertNodeAtFirst(head, 15);
//        list.display(newHead);
//        System.out.println();
//        list.insertAfter(second, 13);
//        list.display(head);
//
//
//    }
//}
