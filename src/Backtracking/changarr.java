package Backtracking;

public class changarr {
    public  static void printarr(int arr[]){
        for(int i =0; i< arr.length; i++){
            System.out.println(arr[i] + "");
        }
        System.out.println();
    }
    public  static void changearray(int arr[], int i , int value ){
        //base case
        if(i == arr.length){
            printarr(arr);
            return;
        }
        //work
        arr[i] = value;
        changearray(arr , i+1, value+1);
        // backtrcking
        arr[i] = arr[i] -2;
    }
    public static void main(String[] args) {
        int  arr[] = new int[5];
        changearray(arr, 0,1);
        printarr(arr);

    }
}
