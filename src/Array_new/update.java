package Array_new;

public class update {

    public  static  void updatee(int mark[]){
        for (int i=0; i< mark.length; i++){
            mark[i] = mark[i] +2;

        }
    }

    public static void main(String[] args) {
        int mark[] = {97, 98, 99};

        // print array
        updatee(mark);
        for (int i =0; i<mark.length; i++){
            System.out.print(mark[i] + " ");
        }

    }
}
