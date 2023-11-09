package Sorting_Algorithm;

public class selection_sort2 {
    public static void slectionS(int arr[]){
        int n = arr.length;
        for (int i =0; i<n; i++){
            int max = i;

            for (int j = i+1; j<n-1; j++){
                if(arr[j+1] > arr[max]){
                    max = j;
                }
            }
            if (max != i){
                int maxnumber = arr[max];
                arr[max] = arr[i];
                arr[i] = maxnumber;
            }
        }
    }
    public static  void main(String args[]){
        int arr[] = {3,6,2,1,8,7,4,5,3,4};

        System.out.println("befor the sorting ");
        for (int i=0; i< arr.length; i++){
            System.out.print(arr[i] + " ");
        }

        slectionS(arr);
        System.out.println();
        System.out.println("after the sorting ");
        for (int i=0; i< arr.length; i++){
            System.out.print(arr[i] + " ");
        }

    }
}
