package Array_new;

public class prefixSubArray {
    public static void maxSumArrayyy(int number[]){
        int maxsum = Integer.MIN_VALUE;
        int currentsum = 0;

        // declare array with size
        int prefix[] = new int[number.length];

        // find prefix array
        prefix[0] = number[0];
        for (int i=1 ; i<number.length; i++){
            prefix[i] = prefix[i-1]+ number[i];
        }
        for (int i =0; i< number.length; i++){
            int start = i;
            for (int j = i ; j< number.length; j++){
                int end =j;
                currentsum = start == 0 ? prefix[end] :  prefix[end] - prefix[start-1];
                 //compare
                if(maxsum<currentsum){
                    maxsum= currentsum;
                }
            }
        }
        System.out.println("max sum of subarray:-- " + maxsum);
    }
    public static void main(String[] args) {
        // int number[] = {2,4,6,8,10};
        int number[] = {1 , -2 ,6,-1 , 3};
        maxSumArrayyy(number);

    }
}
