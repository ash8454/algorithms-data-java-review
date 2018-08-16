package Educative.Arrays.Queues;

import java.util.Arrays;

public class myQueue {
    private int size;
    private int queueArray[];
    private int front; //no of items in front
    private int back; //no of items in back
    private int numOfItems; //total no of items

    public myQueue(int s){
        size = s;
        queueArray = new int[size];
        front = 0;
        back = -1;
        numOfItems = 0;
    }

    public int top(){
        return queueArray[front];
    }

    public boolean isEmpty(){
        return numOfItems == 0;
    }

    public boolean isFull(){
        return numOfItems == size;
    }

    public int size(){
        return numOfItems;
    }

    //add items in queue
    public void enqueue(int value){
        if (isFull()){
            System.err.println("Your queue is full");
            return;
        }
        if (back == size - 1){
            back = -1;
        }
        queueArray[++back] = value;
        ++numOfItems;
    }

    //remove items from queue
    public int dequeue(){
        if (isEmpty()) {
            System.err.println("Your queue is empty");
            return -1;
        }
        int temp = queueArray[front++];
        if (front == size){
            front = 0;
        }
        numOfItems--;
        return  temp;

    }

    public static String[] findBin(int number){
        String[] result = new String[number];
        myQueue queue2 = new myQueue(number + 1);
        queue2.enqueue(1);
        for(int i=0; i < number; i++){
            result[i] = String.valueOf(queue2.dequeue());
            String s1 = result[i] + "0";
            String s2 = result[i] + "1";
            queue2.enqueue(Integer.parseInt(s1));
            queue2.enqueue(Integer.parseInt(s2));
        }
        return result;
    }

    public static void main(String[] args){
        myQueue queue = new myQueue(5);
        System.out.print(queue.isEmpty());
        System.out.printf("%n");
        System.out.print(queue.isFull());
        System.out.printf("%n");
        queue.enqueue(2);
        queue.enqueue(4);
        queue.enqueue(6);
        queue.enqueue(8);
        queue.enqueue(10);
        queue.dequeue();
        queue.dequeue();
        queue.enqueue(12);
        queue.enqueue(14);
        while (!queue.isEmpty()){
            System.out.print(queue.dequeue() + " ");
        }

        String[] binaryString = findBin(4);
        System.out.println(Arrays.asList(binaryString));

    }
}
