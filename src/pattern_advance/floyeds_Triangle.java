package pattern_advance;

public class floyeds_Triangle {

    public  static  void floyed(int n , int counter){
        // otter loop
        for (int i =1; i<=n; i++){
            // inner loop
            for (int j =1 ; j<=i; j++){
                System.out.print(counter+ " ");
                counter++;
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        floyed(5 , 1);
    }
}
