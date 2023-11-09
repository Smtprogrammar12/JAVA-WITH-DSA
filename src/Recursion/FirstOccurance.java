package Recursion;

public class FirstOccurance {
    public  static int firstOcc(int arr[] , int key , int i){
        //base case
        if(i == arr.length){
            return -1;
        }
        if(arr[i] == key){
            return i;
        }
        return firstOcc(arr , key , i+1);
    }

    public  static  int LastOcc(int arr[] , int n , int key){


        //base Case
        if(n == arr[-1]){
            return n;
        }
        if(arr[n] == key){
            return n;
        }

        return LastOcc(arr , n-1, key);
    }
    public static void main(String[] args) {
        int arr[] = {8,3,6,9,5,10,2,5,3};
        int n = arr.length;
        System.out.println(LastOcc(arr , n, 5 ));
    }
}
