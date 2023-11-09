package Array_new;

public class Searching_rotation {
    public static  int rotation(int arr[] , int target){
        int start =0;
        int end = arr.length-1;
        while (start <= end){
            if (arr[start] == target){
                return  start;
            }
            else if (arr[end] == target) {
                return end;
            } else if (arr[start] + arr[end] > target) {
                end--;
            }
            else if (arr[start] + arr[end] < target){
                start++;
            } else if (arr[start] + arr[end] == target) {
                start++;
                end--;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        int arr[] = {1,2,3,4,5,0,6,7,8};
        int target = 0;
        rotation(arr, target);
    }
}
