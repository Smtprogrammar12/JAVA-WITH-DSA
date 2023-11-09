package pattern_advance;

public class half_pyramid {
    public  static  void halfPRD(int n){
        // outter loop
        for (int i =1; i<=n; i++){
            // for spaces
            for (int j=1 ; j<=n-i; j++){
                System.out.print(" ");
            }
            // for star
            for (int j =1; j<=i; j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
       halfPRD(10);
    }
}
