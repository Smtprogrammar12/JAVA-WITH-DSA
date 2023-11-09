package functons;

import java.util.Scanner;

public class factorial {

    public  static  int fact( int a){
        int facto  = 1;
        for (int i =1; i<=a; i++){
            facto *= i;
        }
        return facto;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();

        int factrol = fact(num);
        System.out.println("Factorial of a number:--" + factrol);
    }
}
