package Array_new;

public class Max_Min_Element {
    public  static  void MaxElement(int arr[]){
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        for (int i=0; i< arr.length; i++){
            if (arr[i] > max){
                max = arr[i];
            }

            if (arr[i] < min){
                min = arr[i];
            }
        }
        System.out.println("max element in the given array:-- " + max);
        System.out.println("Min element in the given array:-- " + min);

    }
    public static void main(String[] args) {
        int arr[] = {3,5,4,1,9};
        MaxElement(arr);
    }
}
