
import java.util.*;

public class opertor {

    public static void oddnum(int n){
        int bitmark =1;
        // 0 Even Num:
        if((n & bitmark)==0){
            System.out.println("Even Number is:");
        }else{
            System.out.println("Odd Number is:");
        }
    }
    public static void main(String[] args) {
        oddnum(4);

        //// Binary AND Using: 
        System.out.println((5 & 3));

        //// Binary OR Using:
        System.out.println((5 | 6));


        /// Using the method  of xor
        System.out.println( (5^6));

        //Ons's complement code:

        System.out.println(~5);


        /// Binsry Left shift Operator

        System.out.println((5<<2));

        // 

        /// performe the opertion bitmark:





        }
}
