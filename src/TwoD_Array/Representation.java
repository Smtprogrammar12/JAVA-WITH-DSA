package TwoD_Array;

import java.util.Scanner;

public class Representation {
    // search an array
    public static  boolean search(int matrix[][] , int key){
        for (int i =0 ; i<matrix.length; i++){
            // for column
            for (int j =0; j<matrix[0].length; j++){
                if (matrix[i][j] == key){
                    System.out.print("found element at (" + i +"," + j + ")");
                    return true;
                }
            }
        }
        System.out.print("Element are not found");
        return false;
    }
 // find the greatest number
    public static int greatest(int matrix [][]) {
        int max = matrix[0][0];
        for (int i = 0; i < matrix.length; i++) {
            // inner loop
            for (int j = 1; j < matrix[0].length; j++) {
                if (matrix[i][j] > max) {
                    max = matrix[i][j];
                }
            }

        }
        return max;
    }

    public static void main(String[] args) {
        int matrix[][] = new int[3][3];
        int n = matrix.length , m = matrix[0].length;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the element");
        // for row
        for (int i =0 ; i<n; i++){
            // for column
            for (int j =0; j<m; j++){
                matrix[i][j] = sc.nextInt();
            }
        }

        // output
        for (int i =0 ; i<n; i++){
            // for column
            for (int j =0; j<m; j++){
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
//        search(matrix,5);
        System.out.println("max number:-- " + greatest(matrix));

    }
}
