// public class solution {
//     /// Prime Number Bah Number Hote he Jo Kisi Ke Table Me Nhi ate He

//     /// Using Prime To True False :
//     // public static boolean primen(int a){
//     //     boolean Isprime=true;
//     //     for(int i=2;i<=a-1;i++){
//     //     if(a%i==0){
//     //     Isprime =false;
//     //     }
//     //     }
//     //     return Isprime;
//     // }

//     //// Witout using The Prime Number :
//     // public static boolean Prime(int a){


//     //     for(int i=2;i<=a-1;i++){
//     //     if(a%i==0){
//     //      return false;
//     //     }
    
//     //     }
//     //     return true;
//     // }

//     /// Using of the sqare :

//     public static boolean IsPrime(int n){

//         for(int i=2;i<=Math.sqrt(n);i++){
//             if(n==2){
//                  return true;
//             }
//             if(n%i==0){
//                 return false;
//             }
//         }
//         return true;
//     }

//     public static void main(String[] args) {
//         // boolean primenot=primen(17);
//         // System.out.println(primenot);

//         boolean primenot= IsPrime(1);
//         System.out.println(primenot);
//     }
// }


/**
 * solution
 */
// public class solution {
//     public static boolean Primep(int n){
        
//         for(int i=2;i<=Math.sqrt(n);i++){
//             if(n==2){
//                 return true;
//             }
//             if(n%i==0){
//                 return false;
              
//             }
//         }
//         return true;      
//     }

//     public static void Range(int n){
//         for(int i=2;i<=n;i++){
//           if (Primep(i)) {
//             System.out.print(i+ " ");
            
//           }
   
//         }
//         System.out.println();
        
//     }

//     public static void main(String[] args) {
//   Range(20);
   

         
//     }
// }


/// Binary to Decimal:

import java.util.Scanner;

/**
 * solution
 */
public class solution {

  public static void BinaryTode(int BinNum){
     int mynum=BinNum;
    int pow=0;
    int decNum=0;
    while (BinNum>0) {
      
  
    int lastdigit = BinNum % 10;
     decNum = decNum+(lastdigit*(int)Math.pow(2, pow));
     pow++;
    

     BinNum=BinNum/10;
    };

    System.out.println("Decimal of"+""+mynum+" "+ decNum);
  };


  
  public static void decimaltobi(int n){
    int Binary=0;
    int pow=0;
    int mynum=n;
    while (n>0) {

      int rem=n%2;
    Binary=Binary+(rem*(int)Math.pow(10,pow));
    pow++;
    n=n/2;
      
    }
    System.out.println("Mynum Decimal num"+mynum+" "+ Binary);
  }

  public static boolean Evenof(int n){
    if(n%2==0){
      return true;
    }else{
      return false;
    }
  }


  /// 121 121 321  123


  public static boolean palindrome(int  Number){
    int revers=0;
    int pa=Number;
    while(Number!=0){
 
    int lastdigit =Number%10;
   revers = revers *10 +lastdigit;
   Number =Number/10;
    };
    if(pa==revers){
      return true;
    }
    return false;

  };

  public static int SumOfDigit(int n){
    int SumOfDigit=0;
     while(n>0){
      int lastdigit=n%10;
     SumOfDigit+=lastdigit;
     n=n/10;

     }
     return SumOfDigit;
  };



  /// solution Number 1;

  public static int avarge( int a,int b,int c){
    return (a+b+c)/3;
  };
  public static void main(String[] args) {
  //   BinaryTode(1001);
  //   decimaltobi(20);
  //   /// avarage Formula :
  //  int sum= avarge(10,20,30);
  //  System.out.println(sum);
  System.out.println( "Enter The Number :");
 Scanner Sc=new Scanner(System.in);

 // The Even Number 
//  int Num= Sc.nextInt();

//    if(Evenof(Num)){
//     System.out.println("It's a Even Number :");
//    }else{
//     System.out.println( "It's A odd Number:");
//    };
int Num= Sc.nextInt();
 int satya=SumOfDigit(Num);
 System.out.println( satya);



  

// Palindroma Funcatanality Using Inside it :


// if(palindrome(Num)){
//   System.out.println(" The Num  "+Num+" Is a palindrome:");
// }else{
//   System.out.println(" The Num  "+Num+" Is Not a palindrome:");
// }


/// USing The sum Of Digit :



  
 }

  
}