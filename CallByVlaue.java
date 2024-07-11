public class CallByVlaue {
    /// call By Value Bah VAlue he jo Value Ka copy Pass Karti He 
    // orignal Value Pass Nhi KArti He :
    /// Swap Mehode To exaplain:

    public static void callbyvalue( int a, int b ){

    int swap=a;
    a=b;
    b=swap;
  /// Agar ME Print VAlue Funcation KE Bahar Karau To Value  Orignal Vali PRint Hogi 
  // Isse Pata Chalta he Ki ye copy Value HE :

    System.out.println("A is "+a);
    System.out.println("B Value "+b);

  
    }
    
  public static void main(String[] args) {
    // int a=10;
    // int b=20;
    // int swap=a;
    // a=b;
    // b=swap;

    // System.out.println("a Value:"+a);
    // System.out.println("B Value"+b);
   /// Copy Past Value :
    int a=10;
    int b=20;
  
   callbyvalue( a,b);


   /// Yaha Print Karo ge to orignal value print ho jayegi :
    // System.out.println("a Value:"+a);
    // System.out.println("B Value"+b);


  }


    
     
 


}
