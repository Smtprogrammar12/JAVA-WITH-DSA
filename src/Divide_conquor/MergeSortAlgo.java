package Divide_conquor;

public class MergeSortAlgo {
    public static void print(int arr[]){
        for(int i=0; i<arr.length; i++){
            System.out.print( arr[i] + " ");
        }
        System.out.println();
    }

    public  static void mergesort(int arr[] , int si , int ei){
        //base case
        if (si >= ei){
            return;
        }
        int mid = si + (ei-si)/2;
        mergesort(arr , si , mid);
        mergesort(arr , mid+1 , ei);
        merge(arr ,si , mid , ei);
    }

    public  static  void  merge(int arr[] , int si , int mid , int ei){
        // temorary array
        int temp[] = new int[ei-si+1];
        int i =si;
        int j = mid+1;
        int k =0;

        while( i <= mid && j<= ei){
            if (arr[i] < arr[j]){
                temp[k] = arr[i];
                i++;
            }
            else{
                temp[k] = arr[j];
                j++;
            }
            k++;
        }

        // left bache hue element
        while (i <= mid){
            temp[k++] = arr[i++];
        }

        // right bache hue element
        while (j <= ei){
            temp[k++] = arr[j++];
        }

       //  copy temp arry to original arry
        for ( k=0 , i= si; k<temp.length; i++, k++ ){
            arr[i] = temp[k];
        }
    }
    public static void main(String[] args) {
        int arr[] = {6,3,9,5,2,8,-2};

        mergesort(arr , 0 , arr.length-1);
        print(arr);
    }
}
