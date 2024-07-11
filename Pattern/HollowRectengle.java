
import java.util.*;
public class HollowRectengle {
    public static void Hollow_Rectengle( int totalR,int totalc){
        for(int i=1;i<=totalR;i++){
            for(int j=1;j<=totalc;j++){
                if(i == 1 || i == totalR || j == 1 || j == totalc){
                    System.out.print("*");
                }else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }

    }
   public static void main(String[] args) {

    // Using Funcation Methode To build this :

    // int totarow=4;
    // int totalcolum=5;
    
    // for(int i=1;i<=totarow;i++){
    //     for(int j=1;j<=totalcolum;j++){
    //         if(i == 1||i == totarow ||j == 1||j == totalcolum){
    //             System.out.print("*");
    //         }else{
    //             System.out.print("");
    //         }
    //     }
    //     System.out.println();

    // }

    Hollow_Rectengle(4, 5);



   } 

  
}

