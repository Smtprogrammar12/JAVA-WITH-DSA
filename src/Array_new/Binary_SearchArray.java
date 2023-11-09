package Array_new;

public class Binary_SearchArray {
    public  static  int B_Seach(int arr[] , int key){
        int start =0 , end = arr.length;
        while (start <= end){
            int mid = (start+end)/2;
            if(arr[mid] == key ){
                return mid;
            }
            if(arr[mid] < key){
                start = mid;
            }else {
                end = mid-1;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        int arr[] = {2 ,3 ,5 ,7 ,1, 6 ,9,10};
        int key = 10;
        int index = B_Seach(arr , key);
        System.out.println("element at index are :-- " +index );
    }
}
