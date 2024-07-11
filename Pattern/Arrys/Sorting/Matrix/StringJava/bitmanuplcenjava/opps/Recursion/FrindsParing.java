public class FrindsParing {



    public static void satya(int n){
        if(n==1){
             System.out.println( 1);
            return;
        }
         System.out.println( ""+n);
         satya(n-1);
            }
    public static int FrindsParing(int n){
        if(n==1|| n==2){
            return n;
        }
        return FrindsParing(n-1)+FrindsParing(n-1)*FrindsParing(n-2);
    }
   public static void main(String[] args) {
    // System.out.println(FrindsParing(5));
   satya(5);

    //// mere Ko To  recursione hi samjhe me nhi arha he bhai:
   } 
}


// Initial Call: FrindsParing(5)

// FrindsParing(5) calls FrindsParing(4) and FrindsParing(3).
// FrindsParing(4)

// FrindsParing(4) calls FrindsParing(3) and FrindsParing(2).
// FrindsParing(3)

// FrindsParing(3) calls FrindsParing(2) and FrindsParing(1).
// FrindsParing(2)

// FrindsParing(2) returns 2.
// FrindsParing(1)

// FrindsParing(1) returns 1.
// Back to FrindsParing(3)

// FrindsParing(3) calculates and returns 2 + 2 * 1 = 4.
// Back to FrindsParing(4)

// FrindsParing(4) calculates and returns 4 + 4 * 2 = 12.
// Back to Initial Call: FrindsParing(5)

// FrindsParing(5) calculates and returns 12 + 12 * 4 = 60.
// Is call stack me har step par function ek dusre function ko call karta hai, aur jab base case aata hai (n=1 ya n=2), toh result return hota hai. Yeh process recursion ke zariye chalta hai. Final result for FrindsParing(5) is 60. Main umeed karta hoon ki yeh samajhne me madad kare.
