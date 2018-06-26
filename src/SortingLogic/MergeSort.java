package SortingLogic;

public class MergeSort {
    public static void main(String[] args) {
        int[] intArray = {20, 35, -15, 7, 55, 1, -22};

        for(int i=0; i < intArray.length; i++){
            System.out.println(intArray[i]);
        }
    }

    public static void mergeSort(int[] input, int start, int end){
        if (end - start < 2){
            return;
        }

        int mid = (start + end) / 2;
        mergeSort(input, start, mid); //end would be midpoint.
        mergeSort(input, mid, end);  //start would be midpoint
        merge(input, start, mid, end);
    }

    //{20, 35, -15, 7, 55, 1, -22};
    public static void merge(int[] input, int start, int mid, int end){
        if (input[mid - 1] <= input[mid]) {
            return;
        }
    }
}
