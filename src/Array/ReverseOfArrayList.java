package Array;

import java.util.ArrayList;
import java.util.Collections;

public class ReverseOfArrayList {
    static void reverse_elemnt(ArrayList<Integer> list){
        int i =0;
        int j = list.size()-1;
        while (i < j){
            Integer temp = Integer.valueOf(list.get(i));
            list.set(i , list.get(j));
            list.set(j , temp);
            i++;
            j--;
        }
    }
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(10);
        list.add(20);
        list.add(30);
        list.add(40);
        list.add(50);
        System.out.println("original list are " + list);
        // direct reverse method without using swap function;
        Collections.reverse(list);
        // using swap function;
       // reverse_elemnt(list);
        System.out.println("after the reverse " + list);
        System. out. println("Reversed List " + list);
        Collections. sort(list) ;
        System. out. println("Ascending order " + list);
        Collections.sort(list, Collections.reverseOrder());
        System.out.println("decending order "+list);
    }
}
