package AmazonInterviewPrep;

//Questions
//Does array contain duplicates
//Is Array sorted?

//can we sort them

//PseudoCode

//Sort array
//get the first item
//get the last item
//create a arraylist
//while loop until first < second
  //int sum = first + last
  //if sum equals v
   //add it in arraylist


import java.util.ArrayList;
import java.util.Arrays;

public class FindPairThatEqualsToSum {
    public static void main(String[] args){
        int[] arr = {1, 2, 4, 3, 6};
        System.out.println(findPairEqualsToValue(arr, 5).toString());

    }

    static ArrayList<Integer> findPairEqualsToValue(int[] arr, int v){
        ArrayList<Integer> myArrList = new ArrayList<>();
        Arrays.sort(arr);
        int first = arr[0];
        int last = arr[arr.length - 1];
        while (first < last){
            int sum = first + last;
            if (sum == v){
                myArrList.add(first);
                myArrList.add(last);
                return myArrList;
            } else if (sum < v){
                first++;
            } else {
                last--;
            }
        }
        return myArrList;

    }
}
