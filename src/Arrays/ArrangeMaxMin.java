package Arrays;

public class ArrangeMaxMin {
    public static int[] maxMin(int[] arr){
        int pointer1 = 0;
        int pointer2 = arr.length -1;
        int[] result = new int[arr.length];
        boolean switchPointer = true;
        for(int i=0; i<arr.length; i++){
            if (switchPointer){
                result[i] = arr[pointer2--];
            } else {
                result[i] = arr[pointer1++];
            }
            switchPointer = !switchPointer;
        }
        return result;
    }


    public static void main(String[] args){
        int[] arr = {1,2,3,4,5};
        int[] finalArr = maxMin(arr);
        for(int i=0;i<finalArr.length;i++){
            System.out.print(finalArr[i]+" ");
        }
    }
}
