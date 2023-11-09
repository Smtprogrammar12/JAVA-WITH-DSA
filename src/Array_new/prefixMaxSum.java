package Array_new;

public class prefixMaxSum {
    public  static  void Maxsum(int arr[]){
        int Currentsum =0;
        int maxSum = Integer.MIN_VALUE;
       // int minSum = Integer.MAX_VALUE;
        int prefix[] =new int[arr.length];
         prefix[0] = arr[0];
        // calculate prefix array
        for (int i =1 ; i< prefix.length; i++){
            prefix[i] = prefix[i-1] + arr[i];
        }

        // outterr loop
        for (int i=0; i< arr.length; i++) {
            int start = i;

            // subArray loop
            for (int j = i; j < arr.length; j++) {
                int end = j;
                Currentsum = start == 0 ? prefix[end] : prefix[end] - prefix[start - 1];
                // for max sum pair
                if (maxSum < Currentsum) {
                    maxSum = Currentsum;
                }
            }

        }
        System.out.println("Max Sum:-- " + maxSum);
    }
    public static void main(String[] args) {
        int arr[] = {2,4,6,8,10};
        Maxsum(arr);
    }
}


