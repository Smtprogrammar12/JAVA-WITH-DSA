package Array;

import java.util.Scanner;

public class Arrray_Q15 {
    static  void printArray(int arr[]){
        for (int j=0; j< arr.length; j++){
            System.out.print(arr[j] + " ");

        }
        System.out.println();
    }
    static  void shortedArray(int arr[]){
        int n = arr.length;
        int zeros = 0;
        for (int i =0; i<n; i++){
            if(arr[i] == 0){
                zeros++;
            }
        }
        for (int i =0; i< arr.length; i++){
            if (i < zeros){
                arr[i] = 0;
            }
            else{
                arr[i] = 1;
            }
        }
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
        System.out.println("print the original array  ");
        printArray(arr);
        shortedArray(arr);
        System.out.println("sorted array is here ");
        printArray(arr);

    }
}
