package Array_new;

import java.util.Arrays;
import java.util.Scanner;
import java.io.*;

public class choclate_disturibution {
    public  static  int choclate(int arr[] , int student){
        int ans = Integer.MAX_VALUE;
        Arrays.sort(arr);
        for (int i=0; i< arr.length-student; i++){
            int Minw = arr[i];
            int Maxw = arr[i +student-1];
            int gaps = Maxw - Minw;
            if (gaps < ans ){
                ans = gaps;

            }
        }
        return  ans;
    }
    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        System.out.println("Enter the size of the array:-- ");
//        int n = sc.nextInt();
//        System.out.println("Enter the element of array;-- ");
//        int arr[] = new int[n];
//
//        for (int i =0; i<n; i++){
//            arr[i] = sc.nextInt();
//        }
//
//        int student = sc.nextInt();

        int arr[] = {3,4,1,9,56,7,9,12};
        int student = 5;

        int ans = choclate(arr ,student);
        System.out.println("Min gaps are:-- " + ans);

    }
}
