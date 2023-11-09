package Array;

import java.util.Scanner;

public class sprial_print {
    static void print_matrix(int [][] matrix) {
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }
    static void sprialordernumber( int [][] matrix , int r , int c){
        int toprow = 0;
        int buttonrow = r-1;
        int leftcols = 0;
        int rightcols = c-1;
        int totalelement = 0;
        while(totalelement < r * c){
            for (int j = leftcols; j <= rightcols && totalelement < r*c; j++){
                System.out.print(matrix[toprow][j] + " ");
                totalelement++;
            }
            toprow++;
            for (int i = toprow; i <= buttonrow && totalelement < r*c; i++){
                System.out.print(matrix[i][rightcols]+ " ");
                totalelement++;
            }
            rightcols--;
            for (int j = rightcols; j >= leftcols && totalelement <r *c ; j-- ){
                System.out.print(matrix[buttonrow][j] + " ");
                totalelement++;
            }
            buttonrow--;
        }
        for (int i = buttonrow; i>= toprow; i--){
            System.out.print(matrix[i][leftcols] + " ");
            totalelement++;
        }
           leftcols++;
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

        System.out.println(" sprial order of matrix:--");

        sprialordernumber( matrix , r , c);
    }
}
