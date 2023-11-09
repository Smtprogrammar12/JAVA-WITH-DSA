package Array_new;

public class largest_elementArray {
    // find the largest number in the given number
    public static  int largest(int arr[]){
        int larg = Integer.MIN_VALUE;
        for (int i =0; i< arr.length; i++){
            if(arr[i] > larg){
                larg = arr[i];
            }
        }
        return larg;
    }
    // find the smallest number in the given number
    public static  int smallest(int arr[]){
        int small = Integer.MAX_VALUE;
        for (int i =0; i< arr.length; i++){
            if(arr[i] < small){
                small = arr[i];
            }
        }
        return small;
    }
    public static void main(String[] args) {
        int arr[] = {1 ,2, 4,6,9,3};


            System.out.println("largest value are:-- " + largest(arr));
        System.out.println("smallest value are:-- " + smallest(arr));

    }
}
