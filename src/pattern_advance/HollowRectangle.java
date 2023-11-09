package pattern_advance;

public class HollowRectangle {
    public  static  void HollowRectangle1(int totrow , int totCols){
        // outer loop
        for (int i =1; i<= totrow; i++){
            // inner loop
            for (int j=1; j<= totCols; j++){
                // boundary condition
                if ( i ==1 || i== totrow || j==1 || j==totCols){
                    System.out.print("*");
                }
                else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        HollowRectangle1(5,7);
    }
}
