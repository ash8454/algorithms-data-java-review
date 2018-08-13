package Educative.Arrays;


class CheckRemoveEven {

    public static int[] removeEven(int[] arr) {
        int[] newArr = new int[arr.length];
        // Write - Your - Code
        int oddElements = 0;
        for(int i=0; i<arr.length; i++) {
            if (arr[i] % 2 != 0){
                oddElements++;
            }
        }

        //create result array with size of odd elements
        int[] result = new int[oddElements];
        int result_index = 0;

        //for loop
        for(int i=0; i<arr.length; i++){
            if (arr[i] % 2 != 0){
                //System.out.println(result[result_index]);
                result[result_index++] = arr[i];
            }
        }
        return result;
    }

    public static void main(String[] args){
        int[] arr = {1, 2, 4, 5, 10, 6, 3};
        int[] finalArr = removeEven(arr);
        for(int i=0; i<finalArr.length; i++){
            System.out.println(finalArr[i]);
        }
    }


}