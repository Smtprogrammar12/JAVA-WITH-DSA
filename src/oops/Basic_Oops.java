package oops;

public class Basic_Oops {
    public static void main(String args[]){
        pen1 p1 = new pen1();
        p1.setColor("Green");
        System.out.println(p1.getColor());
        p1.setColor("yellow");
        System.out.println(p1.getColor());
        p1.setTip(200);
        System.out.println(p1.getTip());
    }
}

class pen1{
    private  String color;
   private int Tip ;

    void  setColor(String newColour){
        color = newColour;
    }
    String getColor(){
        return  this.color;
    }

    void setTip(int newtip) {
        Tip = newtip;
    }

    int  getTip(){
        return  this.Tip;
    }
}
