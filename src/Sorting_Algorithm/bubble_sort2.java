package Sorting_Algorithm;

public class bubble_sort2 {
    public static void bubbleS(int arr[]){
        //outter loop
        int  n = arr.length;
        int temp;
        for (int i=0; i<n; i++){
            // inner loop
            for (int j =0; j<n-i-1; j++){
                if (arr[j+1] > arr[j]) {
                    temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
             }
            }
        }
    public static void main(String []args){
        int arr[] ={3 ,6,2,1,8,7,4,5,3,4};

        System.out.println("befor the sorting ");
        for (int i=0; i< arr.length; i++){
            System.out.print(arr[i] + " ");
        }

        bubbleS(arr);
        System.out.println();
        System.out.println("after the sorting ");
        for (int i=0; i< arr.length; i++){
            System.out.print(arr[i] + " ");
        }


    }
}
