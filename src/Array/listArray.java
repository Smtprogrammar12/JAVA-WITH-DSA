package Array;

import java.util.ArrayList;

public class listArray {
    public static void main(String[] args) {
        // wrapper class
        Integer a = Integer.valueOf(5);
        System.out.println(a);
        Float b = Float.valueOf(8);
        System.out.println(b);
       // create arraylis
        ArrayList<Integer> l1 = new ArrayList<>();
        // add element in list
        l1.add(1);
        l1.add(2);
        l1.add(3);
        l1.add(4);
        // find element by there indexing
        System.out.println("element of 0 index is "+l1.get(0));
        // print all elenment by using loop;
        System.out.println("all the element of list is here ");
        for (int i = 0; i<l1.size(); i++){
            System.out.print(l1.get(i) + " ");
        }
        System.out.println();
        // print directly of all element
        System.out.println(l1);
        // add element by some indexing
        l1.add(2,100);
        System.out.println(l1);
        // modify in the array list
        l1.set(1 , 200);
        System.out.println(l1);
        // remove elemnet at some index i
        l1.remove(2);
        System.out.println(l1);
        // remove of particular element in the list
        l1.remove(Integer.valueOf(200));
        System.out.println(l1);
    }
}
