public class solutionMtrix {

    

    public static void main(String[] args) {

    int matrix[][]={{1,2,7},
    {4,5,7}
    };
  
    /// find the Count of 7 Using This Method:
    // int key=7;
    // int count=0;

    // for(int i=0;i<matrix.length;i++){
    //     for(int j=0;j<matrix[0].length;j++){
    //     if(matrix[i][j]==key){
    //         count++;
    //     }
    //     }
    // }
    // System.out.println("The 7 count is "+count);
/// Print the Sum all Matrix:

//     int sum=0;

//    for(int i=0;i<matrix[0].length;i++){
//     sum+=matrix[1][i];
//    }
//    System.out.println(sum);


//// Transpot matrix:
int row=1;
int colum=2;
  int Transpot[][]=new int[row][colum];
  for(int i=0;i<colum;i++){
    for(int j=0;j<row;j++){
        Transpot[colum][row]=matrix[row][colum];
    }
  }

  for(int i=0;i<colum;i++){
    for(int j=0;j<row;j++){
       System.out.print(Transpot[i][j]);
    };
    /// Output:
              
    ////Input:
  };


        
    }
    
}
