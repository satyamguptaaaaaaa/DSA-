import java.util.Scanner;

public class FunctionSumOFNumber {

    public static int SumOfNumber( int num1, int num2){
//   Scanner Sc=new Scanner(System.in);
//         int a=Sc.nextInt();
//         int b=Sc.nextInt();
//         int sum=a+b;
//         System.out.println( "Sum Of Number :"+sum);
 int sum=num1+num2;
//  System.out.println("Sum Of Number "+ sum);

// Using The ruturn Type of Funcation:
return sum;

    }
    public static void main(String[] args) {
    Scanner Sc=new Scanner(System.in);
        int a=Sc.nextInt();
       int b=Sc.nextInt();
      int sum= SumOfNumber(a,b);
      System.out.println( "Sum Of Two Number:"+sum);
    };
};
