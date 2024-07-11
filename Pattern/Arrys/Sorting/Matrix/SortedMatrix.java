public class SortedMatrix {
    

    public static boolean SortedMatrix(int matrix[][], int key){
        int row=0;
        int colum=matrix[0].length-1;



        /////// 

        while (row<matrix.length && colum>=0) {
            if(matrix[row][colum]== key){
                System.out.println("("+row+" ,"+colum+")");
                 return true;

            }
            else if(key < matrix[row][colum]) {
                colum--;
                
            }else{
                row++;
            };
           
          
        }
        System.out.println("Key is Not Found:");
        return false;
    }

    public static void main(String[] args) {


        int matrix[][]={{10,20,30,40},
                        { 15,25,35,45},
                        {27,29,37,48},
                         {32,33,39,50}};
    int key=32;
    SortedMatrix(matrix, key);
        
    }
}
