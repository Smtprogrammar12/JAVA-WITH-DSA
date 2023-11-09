package Strings;

import java.util.Scanner;

public class concatanation {

    public  static  void printallcharacter(String str){

        for (int i =0; i<str.length(); i++){

            System.out.print(str.charAt(i) + "");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String name1 = "Majid";
        String name2 = "Shaikh";

        String fullname = name1 + " " +name2;
        printallcharacter(fullname);
    }
}
