package loops;

import java.util.Scanner;

public class ReverseNumber {
    public static void main(String[] args) {
        Scanner Sc = new Scanner(System.in);
        System.out.println("Enter the number:--");
        int n = Sc.nextInt();
        while(n>0){
            int lastdigit = n%10;
            System.out.print(lastdigit);
            n = n/10;
        }
        System.out.println();
    }
}
