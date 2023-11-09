package Array_new;

import java.lang.reflect.Array;

public class DuplicateArray{
    public  static  boolean Duplicate(int arr[]){
        boolean ans = true;
        for (int i =0; i< arr.length; i++){
           for (int j =1; i< arr.length; i++){
               if(arr[i] == arr[j]){
                   return  ans;

               }
               System.out.println("duplicate are available:-- " + ans);
           }

        }

        return false;

    }

    public static void main(String[] args) {
        int arr[] = {1,1,1,3,3,4,3,2,4,2};
        Duplicate(arr);

    }
}
