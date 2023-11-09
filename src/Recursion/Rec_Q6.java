package Recursion;

public class Rec_Q6 {
    static int countNum(int n){
        if(n ==0){
            return 1;
        }
        countNum(n-1);

      return n;
    }
    public static void main(String[] args) {
        System.out.println(countNum(2345));
    }
}
