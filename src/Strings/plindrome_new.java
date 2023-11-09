package Strings;

public class plindrome_new {
    public static boolean SearchPalindrome(String str){
        for ( int i =0; i<str.length()/2; i++){
            // not a palindrome
            if(str.charAt(i) != str.charAt(str.length()-1-i)){
                return  false;
            }
        }
        return true;
    }
    public static void main(String[] args) {
        String str = "racecaR";
        System.out.println( SearchPalindrome(str));
    }
}
