package Educative.Arrays.Stack;

public class myStack {
    private int size;
    private int[] stackArray;
    private int top;

    public myStack(int s){
        stackArray = new int[s];
        size = s;
        top = -1;
    }

    //Returns top element
    public int top(){
        if (!isEmpty()){
            return stackArray[top];
        }else {
            System.err.println("Stack is Empty");
            return -1;
        }
    }

    public boolean isEmpty(){
        return top == -1;
    }

    //return if it is full;
    public boolean isFull(){
        return top == size - 1;
    }


    //push
    public void push(int value){
        if (isFull()){
            System.err.println("Your stack is full");
            return;
        }
        stackArray[++top] = value;
    }

    //pop
    public int pop(){
        if(!isEmpty()){
            return stackArray[top--];
        } else {
            System.err.println("Your stack is empty");
            return -1;
        }
    }

    public static void main(String[] args){
        myStack stack = new myStack(10);
        System.out.println("You have successfully created stack");
        for(int i=0; i < 10; i++){
            stack.push(i);
        }

        System.out.println("Is Stack full:: " + stack.isFull());

        for(int i=0; i < 10; i++){
            System.out.print(stack.pop()+ "");
        }
        System.out.println("");
        System.out.println("Is stack empty? :" + stack.isEmpty());


    }
}
