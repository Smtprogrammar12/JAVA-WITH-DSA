package Array;

import java.util.Arrays;
import java.util.Scanner;

public class Array_Q5 {
    static  int[] last_and_fast( int arr[]){
        Arrays.sort(arr);
       int ans[] ={arr[0] , arr.length-1};

      return  ans;
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
        int ans[] = last_and_fast(arr);
        System.out.println("first elenemt is:-- " + arr[0] + "last element is:--" + arr[1]);
    }
}
