
import java.util.*;

public class incdec {

     public static void Factori( int n){
       if(n==1){
        System.out.println( 1);
        return;
       }

       System.out.println(n+" ");

      Factori(n-1);
    }


    public static void Incresion(int n){
      if(n==1){
        System.out.println( 1);
        return;
      }

      Incresion(n-1);
      System.out.println(n+" ");



    }


    public static void main(String[] args) {
          Factori(10);
          Incresion(10);
    };
};
