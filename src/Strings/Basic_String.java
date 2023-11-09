package Strings;

public class Basic_String {
    public  static  void  printletter(String str){
        for (int i =0; i<str.length(); i++){
            System.out.print(str.charAt(i) + " ");
        }
    }
    public static void main(String[] args) {
        // declaeration
//        String str3 = new String("xyx majid");
//        String str = "abcd";
//        System.out.println(str);
//
//        char str2[] = {'a' , 'b' , 'c' , 'd'};
////        System.out.println(str2);
//        for (int i =0; i< str2.length; i++){
//            System.out.print(str2[i] + " ");
//        }
//        System.out.println();
//        System.out.println("length of String Str3 is  " + str3.length());


//        concatenation.
        String firstName = "Sheikh";
        String lastName = "Majid";
        String FullName = firstName + " " + lastName;
       // System.out.println(FullName + " " + "Tarique");
//        printletter(FullName);
        System.out.println();
//        System.out.println(FullName.charAt(8));
    }

}
