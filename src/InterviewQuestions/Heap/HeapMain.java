package InterviewQuestions.Heap;

import java.util.Iterator;
import java.util.PriorityQueue;

public class HeapMain {
    public static void main(String[] args){
        Heap heap = new Heap(10);
//        PriorityQueue prQueue = new PriorityQueue();
//        prQueue.add(25);
//        prQueue.add(-22);
//        prQueue.add(1343);
//        prQueue.add(54);
//        prQueue.add(0);
//        prQueue.add(-3492);
//        prQueue.add(429);



//        System.out.println(prQueue.peek());
//        System.out.println(prQueue.remove());
//        System.out.println(prQueue.peek());
//        System.out.println(prQueue.poll());
//        System.out.println(prQueue.peek());
//        prQueue.remove(54);
//        System.out.println(prQueue.peek());
//        prQueue.add(-1);
//        System.out.println(prQueue.peek());
//        Object[] ints = prQueue.toArray();
//        for (Object num: ints){
//            System.out.print(num);
//        }


//
//        while (!prQueue.isEmpty()){
//            System.out.print(prQueue.poll());
//        }

        heap.insert(80);
        heap.insert(75);
        heap.insert(60);
        heap.insert(68);
        heap.insert(55);
        heap.insert(40);
        heap.insert(52);
        heap.insert(67);
//
        heap.printHeap();
////        heap.delete(1);
////        heap.printHeap();
//        System.out.println(heap.peek());
        heap.sort();
        heap.printHeap();



    }
}
