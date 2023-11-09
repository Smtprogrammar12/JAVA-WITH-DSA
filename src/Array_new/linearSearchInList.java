package Array_new;

public class linearSearchInList {
    public static int LSI(int numb[], int keys){
        for (int i=0; i<= numb.length; i++) {
            if (numb[i] == keys) {
                return i;
            }

        }
        return -1;
    }
    public static void main(String[] args) {
        int numb[] = {10, 20,30, 40, 50 ,60};

        int index = LSI(numb , 30);

        if(index == -1){
            System.out.println("you are searching wrong item");
        }else {
            System.out.println("your item at index is:-- " + index);
        }

    }
}
