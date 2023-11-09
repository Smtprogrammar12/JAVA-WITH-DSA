package functons;

import java.util.Scanner;

public class product {
    public static int multiply(int a , int b){
        int prodct = a*b;
        return prodct;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number a:-- ");
        int a = sc.nextInt();
        System.out.println("Enter the number b:-- ");
        int b = sc.nextInt();

        int pro = multiply(a , b);
        System.out.println("product of two number is:-- "+ pro);

    }
}
