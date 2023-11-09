package Array_new;

public class pairElement {
    public static  void pairarray(int num[]){
        // total number of pair
        int totalP =0;
        // outter loop
        for (int i =0; i<num.length; i++){
            //int curr = num[i]; // 2,4,6,8,10
            // inner loop for pair
            for (int j = i+1; j< num.length; j++){
                System.out.print("(" + num[i] + "," + num[j]+ ")");
                totalP++;
            }
            System.out.println();
        }
        System.out.println("total number of pair:-- " + totalP);
    }
    public static void main(String[] args) {

        int num[] = {2 ,4,6,8,10};
        pairarray(num);
    }
}
