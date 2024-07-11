import java.util.Scanner;

public class BinomialCoefficent {

    public static int binomial(int n){
        int f=1;
        for(int i=1;i<=n;i++){
            f=f*i;

        }
        return f;
    }
    public static void main(String[] args) {
        
      Scanner Sc=new Scanner(System.in);
      int n= Sc.nextInt();
      int r= Sc.nextInt();

      int factn=binomial(n);
      int factr=binomial(r);
      int factnr=binomial(n-r);
      int BinomialCoefficent=factn/(factr*factnr);
      System.out.println("Binomial "+ BinomialCoefficent);

      

      

       



    } 
}
