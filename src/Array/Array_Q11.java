package Array;

public class Array_Q11 {
    static void changeswap(int a, int b){
        System.out.println("original value before change");
        System.out.println( "a:-- " + a);
        System.out.println("b:---" + b);
        a = a+b;
        b = a - b;
        a = a- b;
        System.out.println("after the change value:---");
        System.out.println( "a:-- " + a);
        System.out.println("b:---" + b);

    }
    public static void main(String[] args) {
        int a= 3;
        int b= 9;
        changeswap(a, b);

    }
}
