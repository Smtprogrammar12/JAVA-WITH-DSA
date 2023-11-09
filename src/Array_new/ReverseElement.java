package Array_new;

public class ReverseElement {
    public  static  void Reverse(int arr[]){
        int start =0, end = arr.length-1;
        while (start < end){
            // swap funtion
            int temp = arr[end];
            arr[end] = arr[start];
            arr[start] = temp;

            start++;
            end--;
        }
        System.out.println();
    }
    public static void main(String[] args) {
        int arr[] = {2, 1, 5, 4,3};
        Reverse(arr);
        // print array
        for (int i=0; i< arr.length; i++){
            System.out.print(arr[i] + " ");
        }
    }
}
