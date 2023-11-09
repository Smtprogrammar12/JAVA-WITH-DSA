package Arraylist;

import java.util.ArrayList;

public class PairSum1 {
//    public static  boolean sump(ArrayList<Integer> list , int target){
//        // this bruce force approach T>C is 0(n2)
//        for (int i =0 ; i<list.size(); i++){
//            for (int j= i+1; j<list.size(); j++){
//                if (list.get(i) + list.get(j) == target){
//                    return true;
//                }
//            }
//        }
//        return false;
//    }

    // alternet method >>> 2 pointer approach >>>>> T>C >>> O(n);
    public  static boolean sump(ArrayList<Integer> list , int target){

        int lp =0 , Rp = list.size()-1;
        while (lp != Rp){
            // case 1

            if(list.get(lp) + list.get(Rp) == target){
                return  true;
            }
            // case 2
            if (list.get(lp) + list.get(Rp) < target){
                lp++;
            }else {
                // case -3
                Rp--;
            }
        }
        return false;
    }
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
        list.add(6);
        int target = 4;
        System.out.println( sump(list , target));
    }
}
