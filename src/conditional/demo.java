package conditional;

import java.util.Scanner;

public class demo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = 22;
        // we can write multiple if else
        if(a >= 18){
            System.out.println("its adults");
        }
        if(a>= 13 && a<=18){
            System.out.println("its teenager");
        }
        else{
            System.out.println("its ohkk");
        }
    }
}
