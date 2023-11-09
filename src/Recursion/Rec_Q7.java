package Recursion;

import java.util.Scanner;

public class Rec_Q7 {
    static  void printmutiple(int n , int k){
        if(k == 0){
            return;
        }
        printmutiple(n , k-1);
        System.out.println(n*k);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value of n ");
        int n = sc.nextInt();
        System.out.println("Enter the value of k ");
        int k = sc.nextInt();
        printmutiple(n , k);
    }
}
