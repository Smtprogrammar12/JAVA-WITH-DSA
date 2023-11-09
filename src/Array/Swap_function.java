package Array;

public class Swap_function {
    static  void Swap( int a , int b){
        System.out.println("original value before change");
        System.out.println( "a:--" + a);
        System.out.println("b:--" + b);

        int temp = a;
           a = b;
           b = temp;
        System.out.println(" value after change");
        System.out.println( "a:--" + a);
        System.out.println("b:--" + b);


    }

    public static void main(String[] args) {
        int a =9;
        int b= 3;
        Swap( a, b);
    }
}
