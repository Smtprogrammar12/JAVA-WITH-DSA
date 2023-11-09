package oops;

public class Abstract_OOps {
    public static void main(String[] args) {
      Horse Hc = new Horse();
      Hc.walk();
      Hc.dog();
      chicken ch = new chicken();
      ch.walk();
      ch.dog();
//
//      Animals An = new Animals();
//      An.walk();

    }
}

   abstract class Animal{
       // non abstractt  method

    void walk(){
        System.out.println("it can walk");
    }

    // Abstract class

    abstract void dog();
}

class Horse extends Animals{
    void  dog(){
        System.out.println("it can walk with four legs");
    }
}
class chicken extends Animals{
    void dog(){
        System.out.println("it can walk with two legs");
    }
}
