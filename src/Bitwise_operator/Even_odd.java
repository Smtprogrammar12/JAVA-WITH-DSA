package Bitwise_operator;

public class Even_odd {
//  Note:-- if LSB bit is Zero it is always  positive number
//    if LSB bit is One it is always Negative number .
    public static  void EvenOrOdd(int n){
        int bitMast = 1;
        if((n & bitMast ) == 0){
            System.out.println("it is Even number");
        }else {
            System.out.println("it is odd Number");
        }
    }
    // find the ith bit in the given number
    public  static  int  getIth(int n , int i){
        int bitmask = 1<<i;
        if((n & bitmask) == 0){
            return 0;
        }else{
            return 1;
        }
    }
    public static  void  main(String[] args){

//      EvenOrOdd(3);
//      EvenOrOdd(4);
//      EvenOrOdd(5);
//      EvenOrOdd(6);

        System.out.println( getIth(10,2));
        System.out.println( getIth(10,3));
    }
}
