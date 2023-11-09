package Recursion;

import java.util.Scanner;

public class Rec_Q9 {
    // for itereative mode
    static int GCD(int x, int y){
        while(x%y != 0){
             int rem = x % y;
             x = y;
             y = rem;
        }
        return y;
    }
    // by recursive method
    static int gcd(int x , int y){
        if(y == 0){
            return x;
        }
//        if (y != 0){
//            return 1;
//        }
        return gcd(y , x%y );
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value of x:--");
        int x = sc.nextInt();
        System.out.println("Enter the value of y:--");
        int y = sc.nextInt();
        System.out.println("greatest common factor:--");
        System.out.println(GCD(x , y));
        System.out.println("recursive answer:--");
        System.out.println(gcd(x , y));

    }
}
