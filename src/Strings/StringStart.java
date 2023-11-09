package Strings;

import java.util.Scanner;

public class StringStart {

    public  static  void printletter(String name){

        for (int i  =0; i<name.length(); i++){
            System.out.print(name.charAt(i) + " ");
        }
        System.out.println();;
    }
    public static  void main(String args[]){
//
        String name = "Shaikh majid 8076892367";
//        System.out.println(name);
////
//        String str = new String("Majid");
//        System.out.println(str);
//
//
//        Scanner sc = new Scanner(System.in);
        // for signal word
//        String str1 = sc.next();
//        System.out.println(str1);
//
//        String str1 = sc.nextLine();
//        System.out.println(str1);

        // String are immutable in java

        // String Length();
//        System.out.println(name.length());

        // concatenation of string

//        String str = "Shaikh";
//        String str1 = "Majid";
////        String Str2 = str + " " + str1;
//        System.out.println(str + " " + str1 + " from azamgarh");

        // charAt() method

        printletter(name);
    }
}
