package Array;

import java.util.Scanner;

public class Array_Q9 {
    static  int max_element(int arr[]) {
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }
        return max;
    }
        static int Second_element(int arr[]){
             int max = max_element(arr);
            for(int i =0; i< arr.length;i++){
                if(arr[i] == max){
                arr[i] = Integer.MIN_VALUE;
            }
        }
       int Second_max_elenemt = max_element(arr);
            return  Second_max_elenemt;
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
        System.out.println("Second max element  are:--" + Second_element(arr));
    }
}
