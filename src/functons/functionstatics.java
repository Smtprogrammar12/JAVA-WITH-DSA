package functons;

public class functionstatics {


        static int roll = 0;

        static int assign() {
            return (++roll);


    }

    public static void main(String[] args) {
     functionstatics d1 = new functionstatics();
     functionstatics d2 = new functionstatics();
        System.out.println(d1.roll);
        System.out.println(d2.assign());
        System.out.println(d2.roll);
    }
}
