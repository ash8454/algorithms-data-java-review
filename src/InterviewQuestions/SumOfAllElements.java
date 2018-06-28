package InterviewQuestions;

import java.util.LinkedList;

public class SumOfAllElements {
    public static void main(String[] args){
        int[] arr = {1, 2, 3, 4,5};
        System.out.println(sumAllElements(arr));
    }

    static double sumAllElements(int[] arr){
        double sum = 0;
        for(int i: arr){
            sum += i;
        }
        return sum;
    }
}
