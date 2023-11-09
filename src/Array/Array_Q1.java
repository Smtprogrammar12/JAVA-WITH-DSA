// count the number of element in the array
package Array;

import java.util.Scanner;

public class Array_Q1 {
    static  int checknumber( int[] arr , int x){
        int count = 0;
        for(int i = 0; i< arr.length; i++){
            if(arr[i] == x){
                count++;
            }
        }
        return count;
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
        System.out.println("number are" + checknumber(arr , x));

    }
}
