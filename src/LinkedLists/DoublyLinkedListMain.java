package LinkedLists;


public class DoublyLinkedListMain {
    public static void main(String[] args){

        Employee janeJones = new Employee("Jane", "Jones", 123);
        Employee johnDoe = new Employee("John", "Doe", 4567);
        Employee marySmith = new Employee("Mary", "Smith", 22);
        Employee mikeWilson = new Employee("Mike", "Wilson", 3245);

        EmployeeDoublyLinkedList list = new EmployeeDoublyLinkedList();
        System.out.println(list.isEmpty());
        list.addToFront(janeJones);
        list.addToFront(johnDoe);
        list.addToFront(marySmith);
        list.addToFront(mikeWilson);
        System.out.println(list.getSize());
        list.printList();

        Employee billEnd = new Employee("Bill", "End", 78);
        list.addtoEnd(billEnd);
//        list.removeFromFront();
        System.out.println(list.getSize());
        list.printList();
        list.removeFromFront();
        System.out.println(list.getSize());
        list.printList();
        list.removeFromEnd();
        System.out.println(list.getSize());
        list.printList();



        
    }
}
