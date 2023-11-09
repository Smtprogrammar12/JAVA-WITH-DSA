package Array;

public class DemoArray {
    void newArry(){
        int[] ages = new int[3];
        ages[0] = 88;
        ages[1] = 99;
        ages[2] = 111;
        System.out.println("here is the int value");
        System.out.println(ages[0]);
        System.out.println(ages[1]);
        System.out.println(ages[2]);
        float[] decimal = new float[2];
        decimal[0] = 66.6f;
        decimal[1] = 77.7f;
        System.out.println("here is the float value");
        System.out.println(decimal[0]);
        System.out.println(decimal[1]);
        String[] name = new String[1];
        System.out.println("here the is the string vlaue");
        name[0] = "Shaikh";
        System.out.println(name[0]);




    }
    public static void main(String[] args) {

        DemoArray obj = new DemoArray();
        obj.newArry();
    }
}
