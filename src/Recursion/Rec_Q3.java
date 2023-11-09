package Recursion;

import java.util.Scanner;

public class Rec_Q3 {
    static  int fib(int n){
        if( n ==0 || n==1){
            return n;
        }
        return fib(n-1) + fib(n-2);
//        int prev = fib(n-1);
//        int preprev = fib(n-2);
//
//        int ans = prev + preprev;
//        return ans ;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for (int i =0; i<= n; i++){
            System.out.println(fib(i));
        }
        System.out.println("nth fibonacci number are ");
        System.out.println(fib(n));
    }
}
