// reverse array without adding new memory;
package Array;

public class Array_Q13 {
    static void SwapArray(int arr[], int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    static void ReversArray(int arr[]) {
        int i = 0;
        int j = arr.length - 1;
        while (i < j) {
            SwapArray(arr, i, j);
            i++;
            j--;
        }

    }

    static  void  print_array( int arr[]) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
    public static void main(String[] args) {
        int arr[] = {1,2,3,4,5};
        ReversArray(arr);
        print_array(arr);
    }
}
