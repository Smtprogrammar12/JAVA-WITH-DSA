package Array_new;

public class Kadanas_Alogorithm {

    public  static  void maxsum(int arr[]){
        int currentS = 0;
        int MaxS = Integer.MIN_VALUE;
        for (int i=0; i< arr.length; i++){
            currentS += arr[i];
            if (currentS <0){
                currentS =0;
            }
            MaxS = Math.max(currentS, MaxS);
        }
        System.out.println("our max sum is :-- " + MaxS);
    }
    public static void main(String[] args) {
        int arr[] = {-1,-2,4,-1,-2,1,5,-3};
        maxsum(arr);
    }
}
