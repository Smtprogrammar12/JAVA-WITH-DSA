package loops;

import java.util.Scanner;

public class sumNumber {
    public static void main(String[] args) {
        Scanner Sc = new Scanner(System.in);
        System.out.println("Enter the number:-- ");
        int num = Sc.nextInt();
        int sum =0;
        int count =0;
        while(count <= num){
            sum += count;
            count++;
        }
        System.out.println("Sum of n number is:-- " + sum);
    }
}
