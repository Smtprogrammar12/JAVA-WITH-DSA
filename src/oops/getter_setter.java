package oops;

class pen{
    private String color;
    private  int tip;

    void setColor(String newColor){
        this.color = newColor;
    }

    String getColor(){
        return this.color;
    }
    void settip(int newtip){
        this.tip = newtip;
    }

    int getTip(){
        return this.tip;
    }
}

public class getter_setter {

    public static void main(String[] args){

        pen p1 = new pen();
        p1.setColor("Red");
        System.out.println( "the color of first pen are:-- " + p1.getColor());

        p1.settip(100);
        System.out.println("the price of first pen is" + p1.getTip());

        p1.setColor("yellow");
        System.out.println("the color of Second pen are:-- " + p1.getColor());

        p1.settip(200);
        System.out.println("the price of Second pen is" + p1.getTip());
    }
}
