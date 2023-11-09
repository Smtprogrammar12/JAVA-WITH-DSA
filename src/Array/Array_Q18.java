// prefix sum of given array;
package Array;

import java.util.Scanner;

public class Array_Q18 {
    static  void printarray( int[] arr){
        int n = arr.length;
        for (int i = 0; i< n ; i++){
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
    static   int [] prefsumArray(int arr[]){
        for (int i = 1; i< arr.length; i++){
            arr[i] = arr[i -1] + arr[i];

        }
        return arr;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the array");
        int n = sc.nextInt();
        int arr[] = new int[n];
        System.out.println("Enter the " + n + " element");
        for (int i =0; i<n; i++){
            arr[i] = sc.nextInt();
        }
        System.out.println("print the original array");
        printarray(arr);

        System.out.println("after the prefix sum");
        int pref[] = prefsumArray(arr);
        printarray(pref);


    }
}
