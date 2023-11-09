package Array;

import java.util.Scanner;

public class Array_Q17 {
    static  int[] ReverseArray(int arr[]){
        int n = arr.length;
        int [] ans = new int[n];
        int j = 0;
        for(int i = n-1; i>= 0; i--){
            ans[j++] = arr[i];
        }
        return  ans;
    }
    static  void printArray(int arr[]){
        for (int j=0; j< arr.length; j++){
            System.out.print(arr[j] + " ");

        }
        System.out.println();
    }
    static  int [] squaresortedArray(int arr[]){
        int n = arr.length;
        int left =0 ,right = n-1;
        int ans[] = new int[n];
        int j = 0;
        while (left < right){
            if(Math.abs(arr[left]) > Math.abs(arr[right])){
                ans[j++] = left * left;
                left++;
            }
            else{
                ans[j++] = right * right;
                right--;
            }
        }
        return ans;
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
         int ans[] = squaresortedArray(arr);
        System.out.println("sorted array is here ");
        ReverseArray(ans);
        printArray(ans);
    }
}
