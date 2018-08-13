package Educative.Arrays;

public class RotateArray {

    public static int[] rotateArray(int[] arr){
        //first save the last one from the array
        //then iterate over with for loop starting from end and shift by one
        int last = arr[arr.length-1];
        for(int j=arr.length-1; j>0; j--){
            arr[j] = arr[j-1];
        }
        arr[0] = last;
        return arr;
    }
    public static void main(String[] args){
        int[] arr = {1,2,3,4,5};
        int[] newArr = rotateArray(arr);
        for(int i: newArr){
            System.out.print(i+ "");
        }
    }
}
