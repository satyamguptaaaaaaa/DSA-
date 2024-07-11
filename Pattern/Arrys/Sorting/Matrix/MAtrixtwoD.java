

import java.util.*;

public class MAtrixtwoD {


    public static Boolean MatrixKey(int Matrix[][],int key){
        for(int i=0;i<Matrix.length;i++){
            for(int j=0;j<Matrix[0].length;j++){
                if(Matrix[i][j]==key){
                    System.out.println("The Cell No is "+"("+ i+" , "+j+")");
                    return true;
                }
           
            }
        }
        return false;
    }
      public static void main(String[] args) {
        // Creating a 3x3 matrix
        int Matrix[][] = new int[3][3];
        int n = Matrix.length;  // Number of rows
        int m = Matrix[0].length;  // Number of columns

        Scanner sc = new Scanner(System.in);

        // Taking input for each element of the matrix
        System.out.println("Enter elements of the matrix:");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                Matrix[i][j] = sc.nextInt();
            }
        }

        // Printing the matrix
        System.out.println("The matrix is:");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                System.out.print(Matrix[i][j] + " ");
            }
            System.out.println();
        }
        MatrixKey(Matrix,6);
    }
    
}
