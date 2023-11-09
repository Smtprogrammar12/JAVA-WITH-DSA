package Strings;

public class sub_string {

    public  static String substringP(String str , int si , int ei){
        String SubS = "";
        for (int i =si ; i<ei ; i++){
            SubS  +=  str.charAt(i);
        }
        return SubS;
    }

    public static void main(String[] args) {
        String str = "HELLOWORLD";
  // this is inbuild function
        System.out.println(str.substring(0 ,5));

        // this is normally call
      //  System.out.println("Sub string are of given string : " + substringP(str , 0 ,5));
    }
}
