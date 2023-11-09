package oops;

public class withoutStatic {

    static  class counter{
        int count;

        public  counter(){
            count++;
            System.out.println(count);
        }
    }

    //Java Program to demonstrate the use of a static method.
    static class Student{
        int rollno;
        String name;
        static String college = "ITS";
        //static method to change the value of static variable
        static void change(){
            college = "BBDIT";
        }
        //constructor to initialize the variable
         Student(int r, String n){
            rollno = r;
            name = n;
        }
        //method to display values
        void display()
        {System.out.println(rollno+" "+name+" "+college);}
    }
    public static void main(String[] args) {
//        counter c1 = new counter();
//        counter c2 = new counter();
//        counter c3 = new counter();

        Student s1 = new Student(222 , "shaikh Majid");
        s1.change();
        s1.display();
    }
}
