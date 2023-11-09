package Inheritance;

public class BasicInheritance {
    static  class employee{
        float salary = 10000;
    }
    static class programmer extends employee{
        int bonus = 2000;
    }
    public static void main(String[] args) {
        programmer p1 = new programmer();
        System.out.println("slary of emp " + p1.salary);
        System.out.println("bonus of pro " + p1.bonus);

    }
}
