public class Tinning {
    public static int Tinning( int n){

         /////
         if(n==0||n==1){
            return 1;
         }

         int fnm1=Tinning(n-1);
         int fnm2=Tinning(n-2);
          return fnm1+fnm2;

    }
    public static void main(String[] args) {
        

        System.out.println( Tinning(8));
    }
}


// Tinning(2) receives these values and returns 2.
// Tinning(3) receives 2 and 1 and returns 3.
// Tinning(4) receives 3 and 2 and returns 5.
// Tinning(5) receives 5 and 3 and returns 8.
// Tinning(6) receives 8 and 5 and returns 13.
// Tinning(7) receives 13 and 8 and returns 21.
// Tinning(8) receives 21 and 13 and returns 34.
// Tinning(9) receives 34 and 21 and returns 55.
// Tinning(10) receives 55 and 34 and returns 89.
// Tinning(11) receives 89 and 55 and returns 144.
// Tinning(12) receives 144 and 89 and returns 233.
// Tinning(13) receives 233 and 144 and returns 377.
