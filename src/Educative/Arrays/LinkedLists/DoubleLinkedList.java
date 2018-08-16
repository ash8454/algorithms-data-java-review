package Educative.Arrays.LinkedLists;

public class DoubleLinkedList {
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

}
