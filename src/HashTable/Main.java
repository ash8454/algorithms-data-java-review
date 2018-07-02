package HashTable;


import Queues.ArrayQueue;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;


public class Main {
    public static void main(String[] args){

        Employee janeJones = new Employee("Jane", "Jones", 123);
        Employee johnDoe = new Employee("John", "Doe", 4567);
        Employee marySmith = new Employee("Mary", "Smith", 22);
        Employee mikeWilson = new Employee("Mike", "Wilson", 3245);
        Employee billEnd = new Employee("Bill", "End", 3245);

        Map<String, Employee> hashMap = new HashMap<String, Employee>();
        hashMap.put("Jones", janeJones);
        hashMap.put("Doe", johnDoe);
        hashMap.put("Smith", marySmith);

        Iterator<Employee> iterator = hashMap.values().iterator();
        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }

        //only in java 8
        hashMap.forEach((k, v) -> System.out.print("Key = " + k));

        //queue.printQueue();
//        queue.remove();
//        System.out.println("--------------");
//        //queue.printQueue();
//        System.out.println(queue.peek());
        //ht.printHashTable();

        
    }
}
