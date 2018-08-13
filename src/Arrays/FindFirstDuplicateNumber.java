package Arrays;

class FindFirstDuplicateNumber {

    public static int findFirstDuplicate(int[] arr){
        boolean isRepeated = false;
        //for loop for traversing from left to right
        for(int i=0; i<arr.length; i++){
            for(int j=i+1; j<arr.length; j++){
                if (arr[i] == arr[j]){
                    isRepeated = true;;
                }
            } //end of innner loop;

            if (isRepeated == true){
                return arr[i];
            }
            isRepeated = false;
        }
        return -1;
    }

    public static void main(String[] args){
        int[] arr = {8,2,3,2,6,6};
        System.out.println(findFirstDuplicate(arr));
    }
}