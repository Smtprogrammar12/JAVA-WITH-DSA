package Recursion;

public class Rec_Array_13 {
    static int printsum(int arr[] , int idx){
        if(idx == arr.length-1){
            return arr[idx];
        }
        int smallans = printsum(arr , idx+1);
        return smallans+ arr[idx];
    }
    public static void main(String[] args) {
        int arr[] = {1,2,3,4,5,5};
        System.out.println("sum of all digits are:--");
        System.out.println(printsum(arr , 0));
    }
}
