package Sorting_Algorithm;

public class Bubble_sort {
    public static void bubllle_sort(int arr[]){
        for (int i =0; i< arr.length-1; i++){

          //  boolean swapped = false;
            for (int j=0; j< arr.length-i-1; j++){
                if (arr[j+1] < arr[j]){
                    int temp = arr[j+1];
                    arr[j+1] = arr[j];
                    arr[j] = temp;

                }
            }
//            if (!swapped){
//                break;
//            }
        }
    }
    public static void main(String args[]){
        int arr[] = {4,3,7,1,5};

        // printing
        // before sorting
        System.out.println("Array before bubble sort");
        for (int i=0; i< arr.length; i++){
            System.out.print(arr[i] + " ");
        }
        System.out.println();
        bubllle_sort(arr);
        System.out.println("Array after bubble sort");
        for (int i=0; i< arr.length; i++){
            System.out.print(arr[i] + " ");
        }

    }
}
