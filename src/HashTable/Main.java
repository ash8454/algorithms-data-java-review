package HashTable;


import Queues.ArrayQueue;


public class Main {
    public static void main(String[] args){

        Employee janeJones = new Employee("Jane", "Jones", 123);
        Employee johnDoe = new Employee("John", "Doe", 4567);
        Employee marySmith = new Employee("Mary", "Smith", 22);
        Employee mikeWilson = new Employee("Mike", "Wilson", 3245);
        Employee billEnd = new Employee("Bill", "End", 3245);

        SimpleHashTable ht = new SimpleHashTable();
        ht.put("Jones", janeJones);
        ht.put("Doe", johnDoe);
        ht.put("Wilson", mikeWilson);
        ht.put("Smith", marySmith);

        //queue.printQueue();
//        queue.remove();
//        System.out.println("--------------");
//        //queue.printQueue();
//        System.out.println(queue.peek());
        ht.printHashTable();

        
    }
}
