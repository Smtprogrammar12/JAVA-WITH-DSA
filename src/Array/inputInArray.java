package Array;

import java.util.Scanner;

public class inputInArray {
    static void printArry(int[] arr){
        for(int i = 0; i<arr.length; i++){
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of element");
        int n = sc.nextInt();
        System.out.println("Enter the " + n+ " element");
        int [] arr = new int[n];
        for(int i =0; i< arr.length; i++){
            arr[i] = sc.nextInt();
        }
//        for(int i = 0; i<n; i++){
//            System.out.print(arr[i] + " ");
//        }
        System.out.println("original array");
        printArry(arr);
        //int [] arr_2 = arr;
       int[] arr_2 = arr.clone();
       // int [] arr_2 = inputInArray.copyOf();
        System.out.println("copied array");
        printArry(arr_2);
        // after the changing in arr_2
        arr_2[0] = 0;
        arr_2[1] = 0;
        System.out.println("original array");
        printArry(arr);
        System.out.println("changing in arr_2");
        printArry(arr_2);


    }
}
