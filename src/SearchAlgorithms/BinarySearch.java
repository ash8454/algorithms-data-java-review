package SearchAlgorithms;

//Only applicable if the data is sorted
//Use binary search after sorting the array

public class BinarySearch {
    public static void main(String[] args){
        int[] intArray = { 20, -15, 1, 11, 7 , 20, 35, 55  };
//        System.out.println(iterativeBinarySearch(intArray, -15));
//        System.out.println(iterativeBinarySearch(intArray, 1));
//        System.out.println(iterativeBinarySearch(intArray, 35));
//        System.out.println(iterativeBinarySearch(intArray, 8888));

//        System.out.println(isNumberPresent(intArray, 1));
//        System.out.println(isNumberPresent(intArray, 2));
        //Recursive
//        System.out.println(recursiveBinarySearch(intArray, -15));
//        System.out.println(recursiveBinarySearch(intArray, 1));
//        System.out.println(recursiveBinarySearch(intArray, 35));
//        System.out.println(recursiveBinarySearch(intArray, 8888));

        System.out.println(isBinarySearchNumberPresent(intArray, 1));
        System.out.println(isBinarySearchNumberPresent(intArray, 2));
//        System.out.println(isRecursiveBinarySearchNumberPresent(intArray, 0, intArray.length, 1));

    }

    public static int iterativeBinarySearch(int[] input, int value){
       int start = 0;
       int end = input.length;

       while (start < end){
           int midPoint = (start + end) / 2;
           System.out.println("Midpoint = " + midPoint);
           if (input[midPoint] == value){
               return midPoint;
           } else if (input[midPoint] < value){
               start = midPoint + 1;

           } else {
               end = midPoint;
           }
       }
       return -1;
    }

    public static int recursiveBinarySearch(int[] input, int value){
        return recursiveBinarySearch(input, 0, input.length, value);
    }


    public static int recursiveBinarySearch(int[] input, int start, int end, int value){
        if (start >= end){
            return -1;
        }

        int midPoint = (start + end ) / 2;
        System.out.println("Midpoint = " + midPoint);
        if (input[midPoint] == value){
            return midPoint;
        } else if (input[midPoint] < value){
            return recursiveBinarySearch(input, midPoint + 1, end, value);

        } else {
            return recursiveBinarySearch(input, start, midPoint, value);
        }

    }

    public static boolean isBinarySearchNumberPresent(int[] input, int value){
       int start = 0;
       int end = input.length;
       while (start < end){
           int midPoint = (start + end) / 2;
           if (input[midPoint] == value){
               return true;
           } else if (input[midPoint] < value){
               start = midPoint + 1;
           } else {
               end = midPoint;
           }
       }
      return false;
    }

    public static boolean isRecursiveBinarySearchNumberPresent(int[] input, int start, int end, int value){
        //Binary search
        //Start from 0
        //End with input array length
        //Get the midpoint
        //While loop until you find your number
        if (start >= end){
            return false;
        }

        int midPoint = (start + end ) / 2;
        System.out.println("Midpoint = " + midPoint);
        if (input[midPoint] == value){
            return true;
        } else if (input[midPoint] < value){
            isRecursiveBinarySearchNumberPresent(input, midPoint+1, end, value);
        } else {
            isRecursiveBinarySearchNumberPresent(input, start, midPoint, value);
        }
        return false;
    }
}
