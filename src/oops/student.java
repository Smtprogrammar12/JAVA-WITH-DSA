package oops;
class students{
    int age;
    String name;

}
class  gniot{
    int NoOfstd;
    String name;

}
public class student {
    public static void main(String[] args) {

        students std = new students();
        gniot gnit = new gniot();

        // first class property
        std.age = 20;
        std.name = "Shaikh Majid";

        // second class property

        gnit.NoOfstd = 2000;
        gnit.name  = "institute";

        System.out.println(std.name + " " + std.age);
        System.out.println(gnit.name+ " "+ gnit.NoOfstd);
    }
}
