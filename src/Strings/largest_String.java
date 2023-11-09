package Strings;

public class largest_String {
    public static void main(String[] args) {
        String str1[] = {"apple" , "mango" , "banana"};

        String largest = str1[0];
        for (int i =1 ; i< str1.length; i++){
            if(largest.compareTo(str1[i])<0){
                largest= str1[i];
            }
        }
        System.out.println(largest);
    }



}
