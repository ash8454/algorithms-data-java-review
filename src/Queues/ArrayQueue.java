package Queues;

import HashTable.Employee;

import java.util.NoSuchElementException;

public class ArrayQueue {
    private Employee[] queue;
    private int front;
    private int back;

    public ArrayQueue(int capacity){
        queue = new Employee[capacity];
    }

//    public void add(Employee employee){
//        if (back == queue.length) {
//            Employee[] newArray = new Employee[2 * queue.length];
//            System.arraycopy(queue, 0, newArray, 0, queue.length);
//            queue = newArray;
//        }
//
//        queue[back] = employee;
//        back++;
//    }

    public void add(Employee employee){
        if (back == queue.length - 1) {
            Employee[] newArray = new Employee[2 * queue.length];
            System.arraycopy(queue, 0, newArray, 0, queue.length);
            queue = newArray;
        }

        //0 - jane - front
        //1 - john
        //2 - mary
        //3 - mike
        //4   - bill -  back
        //5
        //6
        //7

        queue[back] = employee;
        if (back < queue.length - 1){
            back++;
        } else {
            back = 0;
        }

    }

    public Employee remove(){
        if (size() == 0) {
            throw new NoSuchElementException();
        }
        Employee employee = queue[front];
        queue[front] = null;
        front++;
        if (size() == 0){
            front = 0;
            back = 0;
        }
        return employee;
    }

    public Employee peek() {
        if (size() == 0) {
            throw new NoSuchElementException();
        }
        return queue[front];
    }

    public int size() {
        return back - front;
    }

    public void printQueue() {
        for (int i = front; i < back; i++){
            System.out.println(queue[i]);
        }
    }

}
