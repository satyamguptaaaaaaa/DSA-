public class Nqueee {

    public static void Nqueee( char bord[][], int row){

        if(row== bord.length){
          Print(bord);
            return;
        }
///Recursion Is very herd topic : i can't Undrestand It's because it Very herd :-~~~~~
        for(int j=0;j<bord.length;j++){
            bord[row][j]='Q';
            Nqueee(bord, row+1);
            bord[row][j]='x';
        }
    }

    public static void Print(char bord[][]){
        System.out.println("------Board Of Queen -------s");
        for(int i=0; i<bord.length;i++){
            for(int j=0; j<bord.length;j++){  
                System.out.print(bord[i][j]+" ");
            }
            System.out.println();
        }
    }
     public static void main(String[] args) {

        int n=2;
        char bord[][]=new char[n][n];

        for(int i=0; i<n;i++){
            for(int j=0;j<n;j++){
                bord[i][j]='X';
            }
        }
         
        Nqueee(bord, 0);
        Print(bord);
     }
}




// ///////
// ------Board Of Queen -------s
// Q X 
// Q X 
// ------Board Of Queen -------s
// Q X
// x Q
// ------Board Of Queen -------s
// x Q
// Q x
// ------Board Of Queen -------s
// x Q
// x Q
// ------Board Of Queen -------s
// x x
// x x
