package Recursion;

public class PowerCalc {

    public  static int powerCal(int x , int n){
        //base case
        if(n==0){
            return 1;
        }
// one method
//        int smallcalc = powerCal(x , n-1);
//        int Ans = x*smallcalc;
//        return Ans;
// Second method
        return (x * powerCal(x , n-1));
    }
    public static void main(String[] args) {
        System.out.println(powerCal(2 ,10));
    }
}
