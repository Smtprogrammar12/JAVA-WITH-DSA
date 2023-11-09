package Recursion;

import java.util.Scanner;

public class Rec_Q2 {
    static  int factorial(int n){
        if(n == 0){
            return  1;
        }
        return n*factorial(n-1);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(factorial(n));
    }
}
