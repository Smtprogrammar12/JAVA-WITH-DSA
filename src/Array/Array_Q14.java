package Array;

import java.util.Scanner;

public class Array_Q14 {
    static  int [] Rotate( int arr[] , int k){
        int n = arr.length;
        k = k%n;
        int j = 0;
        int [] ans = new int[n];
        for (int i = n -k; i<n; i++){
            ans[j++] = arr[i];
        }
        for (int i=0; i<n -k ; i++){
            ans[j++] = arr[i];

        }
        return ans;
    }
    static  void printArray(int arr[]){
        for (int j=0; j< arr.length; j++){
            System.out.print(arr[j] + " ");

        }
        System.out.println();
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the array");
        int n = sc.nextInt();
        System.out.println(" Enter the " + n + " Element");
        int arr [] = new int[n];
        for (int i= 0; i<n; i++){
            arr[i] = sc.nextInt();
        }
        System.out.println("Enter the target element:-- ");
        int k = sc.nextInt();
        System.out.println(" print the original array ");

        printArray(arr);

        int ans [] = Rotate( arr , k);
        System.out.println(" rotate the array is here ");
        printArray(arr);

    }
}
