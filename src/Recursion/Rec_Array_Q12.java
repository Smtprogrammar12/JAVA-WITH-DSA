package Recursion;

public class Rec_Array_Q12 {
    static int maxvalue(int arr[] , int idx){
        // base case
        if(idx == arr.length-1){
            return arr[idx];
        }
        // recursive work
        int smallans = maxvalue(arr , idx+1);
        // self work
        return Math.max(smallans,arr[idx]);
    }
    public static void main(String[] args) {
        int arr[] = {3 ,4 ,5 ,6,9, 17};
        System.out.println(maxvalue(arr , 0));
    }
}
