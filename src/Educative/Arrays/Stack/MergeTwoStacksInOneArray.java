package Educative.Arrays.Stack;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;

//You can either divide array in two halves or start stacks at extreme ends.
//We'll use the second technique to solve this problem.
//Top of Stack 1 start from extreme left of array i.e top1 = 0;
//Top of Stack 2 start from extreme right of array i.e top2 = size - 1;
public class MergeTwoStacksInOneArray {

    int size;
    int[] arr;
    int top1, top2; //Store top value indices of Stack 1 and Stack 2
    public MergeTwoStacksInOneArray(int n) {
        size = n;
        arr = new int[size];
        top1 = -1;
        top2 = size;
    }

    //Insert Value in First Stack
    public void push1(int value) {

        //Check for empty space and insert value if there's an empty space.
        if (top1 < top2 - 1) {
            arr[++top1] = value;
        }

    }
    //Insert Value in Second Stack
    public void push2(int value) {

        //Check for empty space and insert value if there's an empty space.
        if (top1 < top2 - 1) {
            arr[--top2] = value;
        }

    }
    //Return and remove top Value from First Stack
    public int pop1() {

        //Get value from top1 index and decrement it.
        if (top1 >= 0) {
            int val = arr[top1--];
            return val;
        }

        return - 1;
    }
    //Return and remove top Value from Second Stack
    public int pop2() {

        //Get value from top2 index and increment it.
        if (top2 < size) {
            int val = arr[top2++];
            return val;
        }
        return - 1;

    }

    public static void main(String[] args){
        ArrayList<Integer> stack1 = new ArrayList<>(3);
//        stack1.add(6);
//        stack1.add(3);
//        stack1.add(2);
        ArrayList<Integer> stack2 = new ArrayList<>(2);
//        stack2.add(5);
//        stack2.add(5);

        MergeTwoStacksInOneArray merge = new MergeTwoStacksInOneArray(stack1.size() + stack2.size());
        merge.push1(3);
        merge.push1(2);
        merge.push1(6);
        merge.push2(5);
        merge.push2(4);
        for (int i=0; i < merge.size; i++){
            System.out.print(merge.top1);
        }

    }

}