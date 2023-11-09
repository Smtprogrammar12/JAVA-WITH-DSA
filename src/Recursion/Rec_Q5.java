package Recursion;

import java.util.Scanner;

public class Rec_Q5 {
    static  int power(int p , int q){
        if(q == 0){
            return 1;
        }
       return power(p , q-1) * p;
    }
    public static void main(String[] args) {
        Scanner sc  = new Scanner(System.in);
        System.out.println("Enter the p value ");
        int p = sc.nextInt();
        System.out.println("Enter the q value ");
        int q = sc.nextInt();
        System.out.println("And the answer is "+power(p,q));
    }
}
