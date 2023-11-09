package Sorting_Algorithm;

public class selection_sort {



    public static  void selection(int arr[]){
        // outtter loop
        int n = arr.length;
        for (int i =0; i< n-1; i++){
            // inner loop
            int min = i;
            for (int j=i+1; j<n; j++){
                if (arr[j] < arr[min]){
                    min = j;
                }
            }
            if (min != i) {
                int smallerNumber = arr[min];
                arr[min] = arr[i];
                arr[i] = smallerNumber;
            }
        }
    }
    public static  void main(String []args){
        int arr[] = {4,1,9,2,3,6};
       selection(arr);
        for (int i =0; i< arr.length-1; i++){
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
}
