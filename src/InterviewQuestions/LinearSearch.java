package InterviewQuestions;

public class LinearSearch {
    public static void main(String[] args){
        //Array
        int[] arr = {1, 2, 4, 5, 6, 8};
        System.out.println(linearSearch(arr, 4));
        System.out.println(isNumberPresent(arr, 4));
        System.out.println(isNumberPresent(arr, 10));

    }

    static int linearSearch(int[] arr, int number){
        for(int i=0; i<arr.length; i++){
            if (arr[i] == number){
                return i;
            }
        }
        return -1;
    }

    static boolean isNumberPresent(int[] arr, int number){
        for(int i=0; i< arr.length; i++){
            if (arr[i] == number){
                return true;
            }
        }
        return false;
    }

}
