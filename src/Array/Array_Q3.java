package Array;

import java.util.Scanner;

public class Array_Q3 {
    static  int count_number( int arr[] , int x){
        int count = 0;
        for (int i =0; i< arr.length; i++){
            if(arr[i] > x){
                count++;
            }
        }
        return  count;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the element");
        int n = sc.nextInt();
        System.out.println("Enter the " + n + "element");
        int [] arr = new int[n];
        for (int i =0; i< arr.length; i++){
            arr[i] = sc.nextInt();
        }
        System.out.println("Enter the element which is compare");
        int x = sc.nextInt();
        System.out.println("total number greater than x: " + count_number(arr , x));
    }
}
