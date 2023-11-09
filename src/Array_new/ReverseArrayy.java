package Array_new;

public class ReverseArrayy {

    public static  void reversee( int arr[]){
        int start =0 , end = arr.length-1;
        while (start < end){

            int temp = arr[end];
            arr[end] = arr[start];
            arr[start] = temp;
            start++;
            end--;
        }
    }
    public static void main(String[] args) {
        int arr[] = {1 ,2,33,4,5,6,7};
        reversee(arr);
        for (int i =0; i< arr.length; i++){
            System.out.print( arr[i] + " ");
        }
        System.out.println();
    }
}
