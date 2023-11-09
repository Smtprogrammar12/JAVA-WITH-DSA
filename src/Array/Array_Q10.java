// first repeat element in the array;
package Array;

import java.util.Scanner;

public class Array_Q10 {
    static  int first_repeat( int arr[]){
        for(int i =0; i< arr.length; i++){
            for(int j = i+1; j< arr.length; j++){
                if(arr[i] == arr[j]){
                    return arr[i];
                }
            }
        }
        return  -1;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the array");
        int n = sc.nextInt();
        System.out.println("Enter the " + n + "element" );
        int []arr = new int[n];
        for(int i = 0; i< arr.length; i++){
            arr[i] = sc.nextInt();
        }
        System.out.println("First repeat element are:-- " + first_repeat(arr));
    }
}
