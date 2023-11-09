package Array_new;

public class binarySearch {
    public  static  int binaryS(int arr[] , int keys){
        int start =0 , end = arr.length-1;
        while(start <= end){
            int mid = (start+end)/2;
            // compare
            if (arr[mid] == keys){
                return mid;
            }
            if(arr[mid]< keys){
                start = mid+1;
            }
            else {
                end = mid-1;
            }
        }
        return  -1;
    }
    public static void main(String[] args) {
        int arr[] = {2,4,6,8,10,12,14};
        int keys = 10;

        System.out.println(" element at index are:- " + binaryS(arr, keys));

    }
}
