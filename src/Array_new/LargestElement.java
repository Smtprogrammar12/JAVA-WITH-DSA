package Array_new;

public class LargestElement {

    public static int largerelement(int arr[]){
        int largest = Integer.MIN_VALUE;
        int smallest = Integer.MAX_VALUE;
        for (int i=0; i<arr.length; i++ ){
            // compare to largest
            if (arr[i] > largest){
                largest = arr[i];
            }
            // comapare to smallest
            if (arr[i] < smallest){
                smallest = arr[i];
            }
        }
        System.out.println("Smallest number in array:-- " + smallest);
        return  largest;
    }
    public  static  void  main(String[] args){
        int arr[] = {1,2,5,6,3,4};
        System.out.println("largest number in array are:-- " + largerelement(arr));
    }
}
