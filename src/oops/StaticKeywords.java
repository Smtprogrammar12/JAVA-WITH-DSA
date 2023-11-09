package oops;

public class StaticKeywords {
    public static void main(String[] args) {

        Studenth s1 = new Studenth();
        s1.SchoolName = "DDPS";
        Studenth s2 = new Studenth();
       // System.out.println(s2.SchoolName);
        Studenth s3 = new Studenth();
        s3.SchoolName = "Gniot";
        System.out.println(s3.SchoolName);
    }
}

class Studenth{
    String name;
    int roll_No;

    static  String SchoolName;

    void setName(String name){
        this.name = name;
    }

    String getName(){
        return this.name;
    }
}
