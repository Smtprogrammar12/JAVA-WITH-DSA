package Recursion;

public class Rec_Array_11 {
    static  void traversiverArray(int arr [], int idx){
        // base case
        if(idx == arr.length){
            return;
        }
        // self work
        System.out.println(arr[idx]);
        // recursive work
        traversiverArray(arr , idx+1);

    }
    public static void main(String[] args) {
       int arr[] = {3,4,5,6,9};
       traversiverArray(arr , 0);
    }
}
