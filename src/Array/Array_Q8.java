package Array;

import java.util.Scanner;

public class Array_Q8 {
    static  int Unique_number(int arr[]){
        for (int i =0; i< arr.length; i++){
            for (int j = i+1 ; j< arr.length; j++){
                if(arr[i] == arr[j]){
                    arr[i] = -1;
                    arr[j] =-1;
                }
            }
        }
        int ans = 0;
        for (int i = 0; i< arr.length; i++){
            if(arr[i] > 0){
                ans = arr[i];
            }
        }
        return  ans;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the array");
        int n = sc.nextInt();
        // System.out.println("Enter the size of the array");
        int [] arr = new int[n];
        System.out.println("enter the " + n + " element");
        for (int i =0; i<n ; i++){
            arr[i] = sc.nextInt();
        }
        System.out.println("Unique number are:--" + Unique_number(arr));
    }
}
