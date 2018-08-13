package Arrays;

class CheckProductInArray{

    public static int[] findProduct(int[] arr){

        int result[] = new int[arr.length];
        int product = 1; //stores the product on the left;
        // Write - Your - Code
        for(int i=0; i<arr.length; i++){
            int currentProduct = 1; //store current product for index i
            //compute product values on the right values of the index
            for(int j = i+1; j<arr.length; j++){
                currentProduct = currentProduct * arr[j];
            }

            //current values * product of the left index values of i
            result[i] = currentProduct * product;
            product = product * arr[i];
        }
        return result;
    }

    public static void main(String[] args){
        int[] arr = {2,3,4,5};
        int[] newArr = findProduct(arr);
        for(int i: newArr){
            System.out.print(i+",");
        }
    }
}
