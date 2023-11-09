package Recursion;

public class IncreasingNumber {
    public  static  void incresNumber(int n){
//  base case
        if(n==10){
            System.out.print(n);
            return;
        }
        // samll work
        System.out.print(n + " ");

        // big work
        incresNumber(n+1);

    }
    public static void main(String[] args) {
        int n =1;
        incresNumber(n);

    }
}
