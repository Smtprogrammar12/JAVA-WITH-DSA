package Strings;

import java.util.Scanner;

public class countTheVowvel {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the String :--  ");
        String str = sc.next();
        int count =0;
        for (int i =0; i< str.length(); i++){

            char ch = str.charAt(i);
            if (ch == 'a' || ch == 'e' || ch== 'i' || ch== 'o' || ch == 'u' ){
                count++;
            }

        }
        System.out.println("lower vowel are in the String:-- " + count);

    }
}
