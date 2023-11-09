package Strings;

public class Palindrome {
    public static  boolean checkp(String str){
   // Rule.
//        divide whole by half and check both side for palindrome

        for (int i =0; i<str.length()/2; i++){
            int n = str.length();
            if (str.charAt(i) != str.charAt(n - i - 1)){
               return  false;
            }
        }
        return true;
    }
    public static void main(String []args){
        String str = "shaikh";
        System.out.println(checkp(str));
    }
}
