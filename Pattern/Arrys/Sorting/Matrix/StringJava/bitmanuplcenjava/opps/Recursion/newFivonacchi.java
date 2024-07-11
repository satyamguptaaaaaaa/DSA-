public class newFivonacchi {


    public static int  Fivonacchi( int n){
        if(n==0|| n==1){
            return n;
        }else{
            int fnm1=Fivonacchi(n-1);
            int fnm2=Fivonacchi(n-2);
            return fnm1+fnm2;
        }
    };
    public static void main(String[] args) {
        System.out.println( Fivonacchi(20));
        
    };
};
