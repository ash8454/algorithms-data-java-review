package Arrays;

public class RearrangeArray {

    public static int[] reArrange(int[] arr){

        //Write - Your - Code
        int[] result = new int[arr.length];
        int resultIndex = 0;
        for(int i=0; i<arr.length; i++){
            if (arr[i] < 0){
                result[resultIndex++] = arr[i];
            }
        }

        for(int k=0; k<arr.length; k++){
            if (arr[k] > 0){
                result[resultIndex++] = arr[k];
            }
        }

        for (int j = 0; j < result.length; j++){
            arr[j] = result[j];
        }
        return arr;
    }

    public static void main(String[] args){
        int[] arr = {10,-1,20,4,5,-9,-6};
        int[] finalArr = reArrange(arr);
        for(int i=0;i<finalArr.length;i++){
            System.out.print(finalArr[i]+" ");
        }
    }
}
