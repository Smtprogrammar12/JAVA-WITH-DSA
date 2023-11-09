package Array;

import java.util.Scanner;

public class Array_Q4 {
    static  boolean check_sorted(int []arr){
        boolean check = true;
        for (int i=1; i< arr.length; i++){
            if( arr[i] < arr[i-1]){
                check = false;
            }
        }
        return check;

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
//        System.out.println("Enter the element which is compare");
//        int x = sc.next        System.out.println("Enter the element which is compare");
//        int x = sc.nextInt();

        System.out.println("Is sorted: " + check_sorted(arr ));
    }
}
