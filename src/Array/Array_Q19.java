package Array;

import java.util.Scanner;

public class Array_Q19 {
    static   int [] prefsumArray(int arr[]){
        for (int i = 1; i<arr.length; i++){
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
        int pref[] = prefsumArray(arr);
        System.out.println("Enter the quries number");
        int q = sc.nextInt();
        while(q-- > 0){
            System.out.println("Enter the range of number");
            int l = sc.nextInt();
            int r = sc.nextInt();

            int ans = pref[r] - pref[l -1];
            System.out.println("sum of array "+ ans);
         }

    }
}
