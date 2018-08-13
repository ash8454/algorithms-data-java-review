package Arrays;

class MergeTwoArrays {

    public static int[] mergeArrays(int[] arr1, int[] arr2) {

        // Write - Your - Code
        int arr1_index = 0;
        int arr2_index = 0;
        int result_index = 0;
        int[] result = new int[arr1.length + arr2.length];

        //while loop to traverse through both ones
        while (arr1_index < arr1.length && arr2_index < arr2.length) {
            if (arr1[arr1_index] < arr2[arr2_index]){
                result[result_index++] = arr1[arr1_index++];
            } else {
                result[result_index++] = arr2[arr2_index++];
            }
        }

        while (arr1_index < arr1.length) {
            result[result_index++] = arr1[arr1_index++];
        }

        while (arr2_index < arr2.length) {
            result[result_index++] = arr2[arr2_index++];
        }

        return result;
    }

    public static void main(String[] args){
        int[] arr1 = {1, 3, 6, 9};
        int[] arr2 = {2, 4, 5, 8};

        int[] finalArr = mergeArrays(arr1, arr2);
        for(int i=0; i< finalArr.length; i++){
            System.out.print(finalArr[i]);
        }
    }
}
