package Array_new;

public class Trappedwater {

    public static int trappedrainwater(int height[]){
        // find max left array
        int n = height.length;
        int leftmax[] = new int[n];
        leftmax[0] = height[0];
        for (int i =1; i<n; i++){
           leftmax[i] = Math.max(height[i] ,leftmax[i-1] );
        }
        // find max right array

        int rightmax[] = new int[n];
        rightmax[n-1] = height[n-1];
        for (int i = n-2; i>=0; i--){
            rightmax[i] = Math.max(height[i] , rightmax[i+1]);
        }
        int trappedwater =0;
        // loop for min of leftmax and rightmax
        for (int i=0; i<n; i++){
            // waterlevel = min(left bound and right max)
            int waterlevel = Math.min(leftmax[i],rightmax[i] );

            // trapped watter = waterlevel - height
            // if width is equal to 1 so we ignore
            trappedwater += waterlevel - height[i];
        }

        return trappedwater;

    }

    public static void main(String[] args) {
        int height[] = {4,2,0,6,3,2,5};
        System.out.println("Trapped water are:-- " + trappedrainwater(height));
    }
}
