package functons;

import java.util.Scanner;

public class DecimalToBinary {
    public  static  void DcimToBin(int DecimalN){
        int myNum = DecimalN;
        int bin =0;
        int pow =0;
        while (DecimalN>0){
            int remain = DecimalN%2;
            bin = bin + (remain *(int)Math.pow(10 , pow));
            pow++;
            DecimalN = DecimalN/2;

        }
        System.out.println("Decimal of " + myNum + " is = " + bin);
    }
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter the Decimal Number:- ");
        int DecimalNum = sc.nextInt();
        DcimToBin(DecimalNum);
    }
}
