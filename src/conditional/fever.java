package conditional;

import java.util.Scanner;

public class fever {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int temp = sc.nextInt();
        if(temp >= 100){
            System.out.println("You have fever.");
        }
        else{
            System.out.println("you feel better");
        }
    }
}
