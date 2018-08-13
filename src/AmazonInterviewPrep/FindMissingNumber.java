package AmazonInterviewPrep;
//Questions
//Is Array sorted
//Is Array contain duplicate numbers

//Pseudo code
//sort the array if it is not already sorted
//compare the nth element + 1 = nth element + 1
//do nothing else return nth element + 1;

public class FindMissingNumber {
    public static void main(String[] args){
        int[] arr = {1, 2, 4, 5, 6};
        //getMissingElement
        System.out.println(getMissingElement(arr));

    }

    static int getMissingElement(int[] arr){
        int[] myArr = new int[arr.length];
        //for loop
        for(int i=0; i < arr.length; i++){
            if (arr[i+1] != arr[i] + 1){
                return arr[i] + 1;
            }
        }
        return 0;
    }
}
