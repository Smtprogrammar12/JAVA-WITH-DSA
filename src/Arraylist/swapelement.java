package Arraylist;

//import java.util.ArrayList;
//import java.util.Collections;
import  java.util.*;

public class swapelement {
    public static  void  swap(ArrayList<Integer> list ,int idx1 ,int indx2 ){

        int temp = list.get(idx1);
        list.set(idx1 , list.get(indx2));
        list.set(indx2, temp);
    }
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(9);// 0(1)
        list.add(1);
        list.add(5);
        list.add(2);
        list.add(3);

        int idx1 = 1 , indx2 = 4;
        System.out.println(list);
//        swap(list , idx1 , indx2);
//        System.out.println(list);

        // sorting list >>> ascending
        Collections.sort(list);
        System.out.println(list);

        // sorting decending array
        System.out.println(list);
        Collections.sort(list , Collections.reverseOrder());
        System.out.println(list);
    }
}
