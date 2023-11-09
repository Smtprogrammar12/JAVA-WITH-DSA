package Strings;

public class EqualBasedQ {
    public static void main(String[] args) {
        String str = "shaikh";
        String str1 = "majid";
        String str2 = "shaikh";

        String str3 = new String("shaikh");

        System.out.println(str.equals(str1) + " " + str.equals(str2) + " " + str.equals(str3) + " " + str1.equals(str3));
        if (str == str3){
            System.out.println("both are equal");
        }
        else {
            System.out.println("both are not equal");
        }

        String str4 = "ShaikMajid".replace('S' , ' ');
        System.out.println(str4);

        // AND or &  operator
        System.out.println(5&6);

        // OR or |  operator
        System.out.println((5 | 6));

        // XOR or ^ operator  ---> same bit = 0 and different bit = 1;

        System.out.println((5^6));

        // binary one's complement or ~
        // it work on only one bits
        System.out.println((~5));

    }
}
