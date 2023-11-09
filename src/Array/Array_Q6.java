package Array;

import java.util.Scanner;

public class Array_Q6 {
    static int pair_sum(int [] arr, int target){
        int ans = 0;
        for (int i =0; i< arr.length; i++){
            for(int j = i+1; j< arr.length; j++){
                if(arr[i] + arr[j] == target) {
                    ans++;
                }
            }
        }
        return ans;
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
        System.out.println("enter the target element:--");
        int target = sc.nextInt();

        System.out.println("total number of pair sum:--" + pair_sum(arr , target) );

    }
}
