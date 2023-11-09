// find the lcm using recursion;
package Recursion;

import java.util.Scanner;

public class Rec_Q10 {
    static int gcd(int x , int y){
            if(y == 0){
                return x;
            }

            return gcd(y , x%y );

        }
        static int lcm(int x , int y){
        int ans = gcd(x , y);
        int lcm = (x * y)/ans;
        return lcm;
        }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value of x:--");
        int x = sc.nextInt();
        System.out.println("Enter the value of y:--");
        int y = sc.nextInt();
        System.out.println("Answer the lcm of two value:--");
        System.out.println(lcm(x , y));

    }
}
