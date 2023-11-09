package D2_Array;

import java.util.Scanner;

public class Basic_2D {

    // search element at index
    public  static boolean Search(int matrix[][] , int key){
        for (int i =0; i< matrix.length; i++){
            for (int j =0 ; j< matrix[0].length; j++){
                if (matrix[i][j] == key){
                    System.out.print("founded element at index " + "(" + i + "," + j+")");
                    return true;
                }
            }
        }
        System.out.println("element are not found");
        return false;
    }

    // find the largest element
    public  static int Largest(int matrix[][] ){
        int larg = Integer.MIN_VALUE;
        for (int i =0; i< matrix.length; i++){
            for (int j =0 ; j< matrix[0].length; j++){
               if(matrix[i][j] > larg){
                   larg = matrix[i][j];

                  }
            }
        }
       return larg;
    }
    public static void main(String[] args) {
        int matrix[][] =new int[3][3];
        Scanner sc = new Scanner(System.in);
        int n = matrix.length , m = matrix[0].length;
        System.out.println("Enter the number:-- ");
        // for input by user
        for (int i =0; i<n; i++){
            for (int j =0 ; j<m; j++){
                matrix[i][j] = sc.nextInt();
            }
        }

        // for output or printing
        for (int i =0; i<n; i++){
            for (int j =0 ; j<m; j++){
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }

//        Search(matrix , 10);
       int value =  Largest(matrix);
        System.out.println("largest element are :-- " + value );
    }
}
