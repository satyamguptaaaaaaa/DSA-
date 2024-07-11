public class InvertedRoatedPeramid {
    public static void   InvertedRoated(int n){
        for(int i=1;i<=n;i++){
            /// space
            for(int j=1;j<=n-i;j++){
        System.out.print(" ");
            }

        for( int j=1;j<=i;j++){
         System.out.print("*");
        }

        System.out.println();
            }
           
        };

        public static void InvertedHalfPeramid(int n){
            for(int i=1;i<=n;i++){
                for(int j=1;j<=4-i+1;j++){
                    System.out.print("*");
                }
    
                System.out.println();
            }
        }


    
    
    public static void main(String[] args) {
        // InvertedRoated(4);
        InvertedHalfPeramid(4);

    }
}
