// in complete question
package Array;

import java.util.Scanner;

public class Array_Q16 {

    static  void Swap(int arr[] , int i , int j){
        int temp = arr[i];
        arr[i] = arr[j];
        arr[i] = temp;
    }
    static void sortedarray(int arr[] ){
        int n = arr.length;
        int left = 0;
        int right  = n-1;
        while(left < right){
            if(arr[left] == 1 && arr[right] == 0){
                Swap(arr , left , right);
                left++;
                right--;
            }
            if(arr[left] == 0){
                left++;
            }
            if(arr[right] == 1){
                right--;
            }
        }

    }
    static void printArray(int arr[]){
        for (int i=0; i< arr.length; i++){
            System.out.print(arr[i] + " ");
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
        System.out.println("print the original array  ");
        printArray(arr);
         sortedarray(arr);

        System.out.println(" after the sorted array:--");
        printArray(arr);
    }
}
