package oops;

public class Inherents_oops {
    public static void main(String[] args) {
        fish shark = new fish();
        shark.eat();
        shark.walk();
        shark.colors = "white";
        System.out.println(shark.colors);
        shark.weight = 50;
        System.out.println(shark.weight);
    }
}

class Animals{
    String colors;

    void eat(){
        System.out.println("It can eat");
    }

    void walk(){
        System.out.println("it can walk");
    }
}

class fish extends Animals{
    int weight;

    void swagging(){
        System.out.println("It can Swamming");
    }
}
