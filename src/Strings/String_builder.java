package Strings;

public class String_builder {
    public static void main(String[] args) {
        StringBuilder str = new StringBuilder();
     // isme copy nhi banti h ye string me change
        // instead of string we can use StringBuilder
        // and string me copy banta h
        for (char i = 'a'; i<='z' ; i++){
            str.append(i +" ");
        }
        System.out.println(str);
    }
}
