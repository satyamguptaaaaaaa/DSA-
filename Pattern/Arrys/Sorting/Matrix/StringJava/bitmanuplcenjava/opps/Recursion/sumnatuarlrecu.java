public class sumnatuarlrecu {
///Radhika tripathi akash Rajput anshika Rajput Manoj Tripathi 

    public static int SumNatuarl( int n){
        if(n==1){
            return 1;
        }
        int fnm=SumNatuarl(n-1);
        int sum=n+fnm;
        return sum;
    }
    public static void main(String[] args) {
       System.out.println( SumNatuarl(5));  
         
    }
    
}
