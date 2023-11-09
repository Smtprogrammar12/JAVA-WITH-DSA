package pattern_advance;

public class number_pyramid {
    public  static void  NUmhalfpyramid(int n){
        // outter loop
        for (int i =1; i<=n; i++){
            // inner loop
            for (int j =1; j<=(n+1-i); j++){
                System.out.print(j+ " ");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        NUmhalfpyramid(6);
    }
}
