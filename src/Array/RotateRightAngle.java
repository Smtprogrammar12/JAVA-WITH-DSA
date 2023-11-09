package Array;

import java.util.Scanner;

public class RotateRightAngle {
    static void print_matrix(int [][] matrix) {
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }
    // using with new space and find the transpose
    static int [][] transporse(int matrix [][] , int r , int c){
        int[][] ans = new int[c][r];
        for(int i = 0; i < c; i++ ) {
            for (int j =i; j<r; j++){
                ans[i][j] = matrix[j][i];
            }
        }
        return ans;

    }
    static  void reversearray(int arr[]){
        int i =0; int j = arr.length-1;
        while(i<j){
            int temp = arr[i];
            arr[i] = arr[j];
            arr[i] = temp;
            i++;
            j--;
        }
    }
    static  void rotate(int [][] matrix , int n ){
        transporse(matrix , n , n);
        for (int i = 0; i<n; i++ ){
            reversearray(matrix[i]);
        }

    }
        public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the row and column of matrix:--- ");
        int r = sc.nextInt();
        int c = sc.nextInt();

        int[][] matrix= new int[r][c];
        int totalelement = r*c;
        System.out.println(" Enter the " + r*c + "element");
        for (int i =0; i<r; i++){
            for (int j=0; j<c; j++){
                matrix[i][j] = sc.nextInt();
            }
        }
        System.out.println("input the original matrix");
        print_matrix(matrix);
        rotate(matrix , r);
        System.out.println("after the rotate");

        print_matrix(matrix);
    }
}
