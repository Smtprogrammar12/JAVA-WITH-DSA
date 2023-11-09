package functons;

import java.util.Scanner;

public class binomial {
    public static int factorial(int n){
        int fact =1;
        for (int i =1; i<=n; i++){
            fact *= fact*i;
        }
        return fact;
    }
    public  static  int bion(int n , int r){
        int n1 = factorial(n);
        int r1 = factorial(r);
        int nr = factorial(n-r);
        int bion = n1/(r1 * nr);
        return bion;

    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value of n ");
        int  n = sc.nextInt();
        System.out.println("Enter the value of r ");
        int r = sc.nextInt();

        System.out.println("bionomial of two number:-- " + bion(n , r));
    }
}
