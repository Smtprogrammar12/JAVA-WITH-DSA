package Bitwise_operator;

public class operator {
    public static void main(String[] args) {
        System.out.println( 5 & 6);
        System.out.println(5 | 6);
//        XOR => same bit = 0 and different bit = 1;
        System.out.println( 5 ^ 6);
//  binary one's complement

        System.out.println(~5);
//        note :-- ~0 = -1
        System.out.println(~0);
//        Binary left  shift

        System.out.println(5<<2); // 2 bit shift left side permanently

        // Binary Right shift

        System.out.println(6>>1); // 1 bit shift right side permanently

    }
}
