package loops;

import java.util.Scanner;

public class first {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number:-- ");
        int num = sc.nextInt();
        int count = 1;
        while(count <= num){
            System.out.print(count+ " ");
            count++;
        }
    }
}
