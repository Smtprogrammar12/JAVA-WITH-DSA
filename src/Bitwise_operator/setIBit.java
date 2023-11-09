package Bitwise_operator;

public class setIBit {

    public static  int setithbit(int n , int i){
        int bitmask = 1<<i;
        return n | bitmask;
    }

    public static  int clearIthbit(int n , int i){
        int maskbit = ~(1<<i);

        return n & maskbit;
    }

    public static  int updateIthbit( int n , int i, int newBit){
        if(newBit ==0){
            return  clearIthbit(n ,i);
        }else {
            return setithbit(n,i);
        }
    }
    public static void main (String[] args){

//        System.out.println(setithbit(10,2));
//        System.out.println(clearIthbit(10,1));
        System.out.println(updateIthbit(10,1,1 ));
    }
}
