package oops;

import java.util.concurrent.Callable;

public class ClassObjectConstructor {

//    public  static class Car{
//        String Name;
//        int topspeed ;
//
////        public Car(String Name , int topspeed){
////            this.Name = Name;
////            this.topspeed = topspeed;
////        }
//
////        public Car(String Scorpio , int 100){
////        this.Name = Scorpio;
////          this.topspeed = 100;
////     }
//
//    }

//   static class Pen{
//        final int price = 20;
//    }

    static   class  Car{
        static int year;
        static String Company_Name;
    }

    public static void main(String[] args) {
//         Car c1 = new Car("Scorpio" , 1200);
//        Car c1 = new Car(Scorpio ,  100)
//        Car c2 = new Car();
//        c2.Name ="Foetuner";
//        c2.topspeed = 1300;
//        System.out.println(c2.Name);
//        System.out.println(c2.topspeed);

        // pen object

//        Pen p1 = new Pen();
////        p1.price  = 15;
//        System.out.println(p1.price);


        // car onject

        Car c = new Car();
        c.year = 2018;
        c.Company_Name = "kia";
        System.out.println(c.year);

        Car d = new Car();
        System.out.println(d.year);


        Car e = new Car();
        System.out.println(e.year);

    }
}
