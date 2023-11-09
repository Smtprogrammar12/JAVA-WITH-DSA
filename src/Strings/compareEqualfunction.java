package Strings;

public class compareEqualfunction {
    public static void main(String[] args) {

        String str1 = "Shaikh";
        String str2 = "Shaikh";
       String str3 = new String("Shaikh");

        if (str1 == str2){
            System.out.println("String are equal");
        }
        else {
            System.out.println("String are not equal");
        }
        if (str1.equals(str3)){
            System.out.println("String are equal");
        }
        else {
            System.out.println("String are not equal");
        }
    }
}
