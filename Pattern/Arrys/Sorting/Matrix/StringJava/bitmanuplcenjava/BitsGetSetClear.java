public class BitsGetSetClear {

    public static  int getihtbit( int n , int i){

        int bitmark=1<<i;
        if((n &bitmark)==0){
            return 0;

        }else{
            return 1;
        }


    }

    public static int setbit(int n, int i){
      int  bitmark = 1<<i;//4 
      // 4=100
      ///5=101
      ///-----
      ///  101===5:    
      // return 1
      return bitmark | n;

    }

    public static int clearbit(int n, int i ){
        int bitmark =~(1<<i);

        ////i=2;
        ///4=100;
        //// 011
        //// 5=101
    ///&oppo  =011
        ///  ------
        /////  001===1
        /// return 0;
        return n & bitmark;
    }

    public static int updateBit(int n, int i, int newbit){
    //     if(newbit==0){
    //         return setbit(n, i);
    //     }else{
    //         return clearbit(n, i);
    //     };
     
    ///
    n= clearbit(n, i);
    newbit=newbit<<i;
    return n| newbit;
     }

     public static int clerrallbit(int n, int i){
        int bitmark=((~0)<<i);
        return bitmark& n;
     }


     public static int clearRangeBit(int n,int i,int j){
        int a=((~0)<<j+1);
        int b=(1<<i-1);
        int bitMArk=a|b;
        return n & bitMArk;

     };

////count The bit :
     public static int countbit(int n){
        int count=0;
        while(n>0){
        if((n&1)!=0){
            count++;
        }
        n=n>>1;
    }
      return count; 
     }


     ////Fast Expontation code:
     public static int Expontation(int a,int n){
   int ans=1;
        while(n>0){
            if((n&1)!=0){
                ans=ans*a;
                
            }
            a=a*a;
            n=n>>1;
        }
        return ans;

     }
    public static void main(String[] args) {
    //     System.out.println( getihtbit(4, 2));
    //     /// Set opertion perform:
    //  System.out.println( setbit(5, 2));

    //  /// clear bit :
    //  System.out.println( clearbit(10, 2));

    System.out.println( getihtbit(4, 2));

    // System.out.println( Expontation(3,4 ));
    //  /// 
    //  System.out.println( countbit(10));
    //  System.out.println( updateBit(10, 2, 1));
    //  System.out.println( updateBit(10, 2, 1));


    //  System.out.println( clerrallbit(10,2));

    //  System.out.println( clearRangeBit(10, 2, 4));



    // //  System.out.println((~(0)<<2));

     
        
    }
    
    // 123
    // 321
}
