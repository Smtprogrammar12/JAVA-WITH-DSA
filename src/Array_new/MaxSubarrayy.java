package Array_new;

public class MaxSubarrayy {
    public static  void  maxsubarray(int arr[]){
        // from start index
        int currsum =0;
        int maxsum = Integer.MIN_VALUE;

        for (int i =0; i< arr.length; i++){

            // till last index

            for (int j =i; j< arr.length; j++){
                currsum =0;
                // just printing
                for (int k = i; k<=j; k++){

                   currsum += arr[k];
                }
                System.out.println(currsum);
                if (maxsum<currsum){
                    maxsum = currsum;
                }

            }

        }
        System.out.println("max sum of Subarray:-- " + maxsum);
    }
    public static void main(String[] args) {
        int arr[] = {2,4,6,8,10};
        maxsubarray(arr);
    }
}

