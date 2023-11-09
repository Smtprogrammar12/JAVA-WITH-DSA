package functons;

import java.util.Scanner;

public class BinaryToDecimal {
    public  static  void binToDeci(int binNum){
        int mybin = binNum;
        int deci = 0;
        int pow = 0;
        while (binNum>0){
            int lastD = binNum%10;
            deci = deci + (lastD * (int)Math.pow(2 , pow));
            pow++;
            binNum = binNum/10;
        }
        System.out.println("Decimal number " + mybin + " is = " + deci);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the binary number:-- ");
        int BinaryNumber = sc.nextInt();
      binToDeci(BinaryNumber);
    }
}
