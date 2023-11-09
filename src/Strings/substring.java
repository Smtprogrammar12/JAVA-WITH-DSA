package Strings;

public class substring {
    public  static  String subS(String Strr , int start , int end){

        String newStr = "";

        for (int i =start; i<end; i++){
            newStr += Strr.charAt(i);
        }
        return newStr;
    }
    public static void main(String[] args) {
        String Strr = "HelloWorld";

        System.out.println(subS(Strr , 0 , 5));

        // alternet method
        System.out.println( Strr.substring(0,5));

    }
}
