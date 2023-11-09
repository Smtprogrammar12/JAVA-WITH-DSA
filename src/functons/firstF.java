package functons;

import java.util.Scanner;

public class firstF {
  // function -1
    public  static  void printhello(){
        System.out.println("Hello world");
        return;
    }
  // function -2
    public  static  void sum(int a , int b){
        int sum = a+b;
        System.out.println("Sum is : " + sum);
    }
    public static void main(String[] args) {
//        printhello();
//        printhello();
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the number of a ");
        int a = sc.nextInt();
        System.out.println("Enter the number of b");
        int b = sc.nextInt();
        sum(a ,b);

    }
}
