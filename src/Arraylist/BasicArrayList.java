package Arraylist;
import java.util.ArrayList;

public class BasicArrayList {
    public static void main(String[] args) {

        ArrayList<Integer> list1 = new ArrayList<>();
        ArrayList<String> list2 = new ArrayList<>();
        ArrayList<Boolean> list3 = new ArrayList<>();

        // add element in list using add function
        list1.add(1);// 0(1)
        list1.add(2);
        list1.add(3);
        list1.add(4);
        list1.add(5);

        System.out.println(list1);

        // get operation by index T.C O(1)

        int element = list1.get(3);
        System.out.println(element);

        // Delete operation >>>> T.C O(n)

        list1.remove(3);
        System.out.println(list1);

        // set element at particular index >>>> T.C O(n)
        list1.set(0 , 100);
        System.out.println(list1);

        // contain operation >>> element exits true/false   >>>> T.C O(n)
        System.out.println(list1.contains(100));
        System.out.println(list1.contains(12));

        // another add function
        list1.add(1,200);
        System.out.println(list1);


        // size() function

        System.out.println("size of the array:-- "+list1.size());

        // print using iteration
        System.out.println("print element using iteration");
        for (int i =0; i<list1.size(); i++){
            System.out.print(list1.get(i) + " ");
        }
        System.out.println();

       // print elemennt reverse oder
        System.out.println("reverse the given eleemnt");
        for (int i = list1.size()-1; i>=0; i--){
            System.out.print( list1.get(i) + " ");
        }
        System.out.println();

        // max element in give arraylist
        int max = Integer.MIN_VALUE;
        for (int i =0; i<list1.size(); i++){
//            if(list1.get(i) > max){
//                max = list1.get(i);
//            }

            // alternet method
            max = Math.max(max , list1.get(i));
        }
        System.out.println( "max element are  "+max);


    }
}
