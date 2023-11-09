package Array;

public class Array_Q12 {
    static  int[] ReverseArray(int arr[]){
        int n = arr.length;
        int [] ans = new int[n];
        int j = 0;
        for(int i = n-1; i>= 0; i--){
            ans[j++] = arr[i];
        }
        return  ans;
    }
    static  void  print_array( int arr[]){
        for( int i =0; i< arr.length; i++ ){
            System.out.print( arr[i] + " ");
        }
        System.out.println();
    }
    public static void main(String[] args) {
        int arr[] = { 1,2,3,4,5};
        int ans[] = ReverseArray(arr);
        print_array(ans);
    }
}
