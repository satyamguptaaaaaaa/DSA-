public class PowerRecursen {


    // public static int Power(int x,int n){
    //     if(n==0){
    //         return 1;
    //     };

    //     return x*Power(x,n-1);


    // }


    public static int power(int x, int n){
        if (n==0) {
            return 1;
        }
        int halfpower=power(x, n/2);
        int fullname=power(x, n/2)*power(x, n/2);
        if(n % 2!= 0){
            fullname = x * fullname;
        };
        return fullname;
    }
    public static void main(String[] args) {
        System.out.println(power(2, 10));
    };
};
