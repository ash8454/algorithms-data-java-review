package InterviewQuestions;

public class BinarySearch {
    public static void main(String[] args){
        //Array is sorted or not
        //Array contains duplicates or not
        //Pseudo code
        int[] arr = new int[]{1, 2, 4, 9, 3, 7, 11};
        //binary search
        System.out.println(binarySearch(arr, 4));

    }

    static int binarySearch(int[] arr1, int number){
        //intialize start as first element
        //initialize end as last element
        //get midpoint
        int start = 0;
        int end = arr1.length;
        while (start < end){
            int midpoint = (start + end)/2;
            if (arr1[midpoint] == number){
                return midpoint;
            } else if (arr1[midpoint] < number){
                start = midpoint + 1;
            } else {
                end = midpoint;
            }
        }
        return -1;
    }
}
