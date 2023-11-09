package Recursion;

public class finaociiN {

    public  static  int fibacci(int n){
        // base case
        if(n ==0 || n==1){
            return n;
        }
        int fib1 = fibacci(n-1);
        int fib2 = fibacci(n-2);
        int fibnacciNumber = fib1+fib2;
        return  fibnacciNumber;
    }
    public static void main(String[] args) {
        int n =6;
        System.out.println("finacci of number:-- " + fibacci(n));
    }
}
