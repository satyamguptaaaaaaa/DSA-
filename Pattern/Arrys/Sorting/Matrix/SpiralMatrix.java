public class SpiralMatrix {

    // public static void spiralMatrix(int matrix[][]) {
    //     int startRow = 0;
    //     int endRow = matrix.length - 1;/// 0 to 3
    //     int startColumn = 0;
    //     int endColumn = matrix[0].length - 1;//0 To 3

    //     while (startRow <= endRow && startColumn <= endColumn) {
    //         // Top
    //         for (int i = startColumn; i <= endColumn; i++) {
    //             System.out.print(matrix[startRow][i] + " ");
    //         }

    //         // Right
    //         for (int i = startRow + 1; i <= endRow; i++) {
    //             System.out.print(matrix[i][endColumn] + " ");
    //         }

    //         // Bottom
    //         for (int i = endColumn - 1; i >= startColumn; i--) {
    //             System.out.print(matrix[endRow][i] + " ");
    //         }

    //         // Left
    //         for (int i = endRow - 1; i > startRow; i--) {
    //             System.out.print(matrix[i][startColumn] + " ");
    //         }

    //         startRow++;
    //         startColumn++;
    //         endRow--;
    //         endColumn--;
    //     }
    //     System.out.println();
    // }

    public static void  spiralMatrix(int matrix[][]){
        int startRow=0;
        int EndRow=matrix.length-1;
        int startColumn=0;
        int EndColumn=matrix[0].length-1;
        while (startRow<=EndRow && startColumn<=EndColumn) {
            ///Top
            for(int i=startColumn;i<=EndColumn;i++){
                System.out.print(matrix[startRow][i]+" ");
            }
            /// Right
            for(int i=startRow+1;i<=EndRow;i++){
                System.out.print(matrix[i][EndColumn]+" ");
            }
            /// Bottom:
            for(int i=EndColumn-1;i>=startColumn;i--){
            
                System.out.print(matrix[EndRow][i]+" ");
            }
            //Left

        for(int i=EndRow-1;i>startRow;i--){
         
            System.out.print(matrix[i][startColumn]+" ");
        }
        startRow++;
        startColumn++;
        EndColumn--;
        EndRow--;
            
        }

        System.out.println();
    };
    public static void main(String[] args) {
        int matrix[][] = { { 1, 2, 3, 4 }, 
                           { 5, 6, 7, 8 }, 
                           { 9, 10, 11, 12 }, 
                           { 13, 14, 15, 16 } };
        // spiralMatrix(matrix);
spiralMatrix(matrix);
    }
}
