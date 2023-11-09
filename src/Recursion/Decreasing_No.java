package Recursion;

public class Decreasing_No {

    public static  void printDec(int n){
        // base case
        if(n==1){
            System.out.print(n);
            return;
        }
        // bigger problem
        System.out.print(n + " ");
        // smaller problem
        printDec(n-1);
    }

    public static void main(String[] args){
        int n = 10;
        printDec(n);
    }
}
