public class Overloading {

    /// Perametar overloading :
    // public static int sum(int a , int b){
    //     return a+b;
    // }
    // public static int sum(int a , int b ,int c){
    //     return a+b+c;
    // }

    /// Data Type Overloading :

    public static int sumdata(int a ,int b, int c){
        return a+b+c;
    };

    public static float sumdata(float a,float b,float c){
        return a+b+c;

    }

    
    public static void main(String[] args) {

        

        /// overloading is performe By using data type :

        //Floating

        // float sum=sumdata( 20.3f,10.2f,20.3f);
        // System.out.println("sum is "+ sum);

        // Integer 

        // int sum =sumdata(20, 30, 80);
        // System.out.println( "sum "+sum);

        // overloading is performe using perametars :
        // int sum=sum(a, b);
        // int rum=sum(a,b,c);
        // System.out.println( "Sum of Three Number :"+rum);
        // System.out.println( "sum of Two Number :"+sum);
    }
}
