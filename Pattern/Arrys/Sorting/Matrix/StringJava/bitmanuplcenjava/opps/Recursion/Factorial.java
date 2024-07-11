

public class Factorial {
    public  static int  fac(int n){
        if(n==0){
            return 1;
        };
         int fnm1=fac(n-1);
        int fn=n*fac(n-1);
        return fn;
    };
        public static int factorial(int n) {
            if (n == 0) {
                return 1;
            } else {
                return n * fac(n - 1);
            }
    };

    public static void main(String[] args) {
        System.out.println(fac(5));
        System.out.println(factorial(5));
    };
};



