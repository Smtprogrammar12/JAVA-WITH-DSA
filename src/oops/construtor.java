package oops;

class Student{
    String name;
    int Roll_No;

    Student(){
        System.out.println("this is Non Paramaterize constructor");
    }

//    this is paramaterize constructor
    Student(String name){
        this.name = name;
    }
    Student(int Roll){
        this.Roll_No =Roll;
    }
    void display(){
        System.out.println(name);
    }
}
public class construtor {
    public static void main(String[] args) {

       Student s1 = new Student();
       Student s2 = new Student("Shaikh");
//        System.out.println(s2.name);
       Student s3 = new Student(888);
//        System.out.println(s3.Roll_No);
        Student s4 = new Student();
        s2.display();


    }
}
