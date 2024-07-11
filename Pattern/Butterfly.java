public class Butterfly {


    public static void Butterfly(int n){
     for(int i=1;i<=n;i++){
        ///Stare
        for(int j=1;j<=i;j++){
            System.out.print('*');
        }
        /// space
        for(int j=1;j<=(n-i)*2;j++){
            System.out.print(" ");
        }
        for(int j=1;j<=i;j++){
            System.out.print("*");
        }
        System.out.println();

     }
     for(int i=n;i>=1;i--){
        for(int j=1;j<=i;j++){
         System.out.print( "*");
        }
        for(int j=1;j<=(n-i)*2;j++){
            System.out.print(" ");
        }
        for(int j=1;j<=i;j++){
            System.out.print("*");
        }
        System.out.println();
     }


    }
    public static void main(String[] args) {
        Butterfly(4);
    }
    
    
}
