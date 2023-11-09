package Array;

import java.util.Scanner;

public class Array_Q20 {
    static int sum(int []arr) {
        int totalsum = 0;
        for (int i = 0; i < arr.length; i++) {
            totalsum += arr[i];

        }
        return totalsum;
    }
    static boolean equalpartition(int arr[]){
        int totalsums = sum(arr);
        int pref = 0;
        for (int i = 0; i<arr.length; i++){
            pref += arr[i];
            int suffix = totalsums - pref;
            if(pref == suffix){
                return true;
            }
        }
        return false;
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
        System.out.println("the partion of prefix and suffix=== " + equalpartition(arr));
    }
}
