package Recursion;

public class SumOfNaturalN {
    public  static int SumN(int n){
        //base case
        if(n ==1){
            return 1;
        }
        int sum = SumN(n-1);
        int totalSum = n+sum;
        return totalSum;
    }
    public static void main(String[] args) {
        int n =5;

        System.out.println("Sum of natural number:-- " + SumN(n));
    }
}
