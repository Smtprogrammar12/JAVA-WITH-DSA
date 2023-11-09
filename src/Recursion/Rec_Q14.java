package Recursion;

public class Rec_Q14 {
    static boolean search(int []arr , int target , int n, int indx ){
        if(indx == n){
            return false;
        }
        if(arr[indx] == target){
            return true;
        }
       return search(arr, target, n, indx+1);
    }
    public static void main(String[] args) {
        int [] arr = {1, 2,3,4,5};
        int target = 55;
        int n = arr.length;
        if (search(arr , target , n, 0))
            System.out.println("yes");
        else
            System.out.println("false");
    }
}
