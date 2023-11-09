package Recursion;

import java.util.Scanner;

public class RecQ1 {
    static void increasingNumber(int n){
        if (n == 1){
            System.out.println(1);
            return;
        }
        increasingNumber(n-1);
        System.out.println(n);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value of n  ");
        int n = sc.nextInt();
        increasingNumber(n);

    }
}
