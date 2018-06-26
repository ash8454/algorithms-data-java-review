//package SortingLogic;
//
//public class RadixSort {
//    public static void main(String[] args) {
//        int[] intArray = {2, 5, 9, 8, 2, 8 , 7, 10, 4, 3 };
//        countingSort(intArray, 1, 10);
//
//        for (int i = 0; i < intArray.length; i++) {
//            System.out.println(intArray[i]);
//        }
//    }
//
//    public static void radixSort(int[] input, int radix, int width){
//       for(int i=0; i < width; i++){
//           radixSingleSort(input, i , radix);
//       }
//
//    }
//
//    public static void radixSingleSort(int[] input, int position, int radix){
//        int numItems = input.length;
//        int[] countArray = new int[radix];
//
//        for (int value: input){
//            countArray[getDigit(position, value, radix)]++;
//        }
//
//        for (int j = 1; j < radix; j++){
//            countArray[j] += countArray[j-1];
//        }
//
//        int[] temp = new int[numItems];
//
//    }
//
//    public static int getDigit(int position, int value, int radix){
//        return value / (int) Math.pow(10, position) % radix;
//    }
//
//}
