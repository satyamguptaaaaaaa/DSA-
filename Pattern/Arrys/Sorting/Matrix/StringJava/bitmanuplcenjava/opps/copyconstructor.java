
import java.util.*;
public class copyconstructor {

    public static void main(String[] args) {

        copyco p1=new copyco();
        p1.name="satyam";
        p1.mark[0]=20;
        p1.mark[1]=30;
        p1.mark[2]=50;

      
        copyco p2=new copyco(p1);
        p2.mark[2]=50;
       
        for(int i=0;i<3;i++){
            System.out.println(p2.mark[i]);
        }        
    }   
}


class copyco{
    String name;
    String password;
    int mark[];
    /// Copy Constructore :

    /// shallow Copy Constructore :

    // copyco(copyco p1){
    //     mark=new int[3];
    //     this.name=p1.name;
    //     this.password=p1.password;
    //     this.mark=p1.mark;
    // }

    /// Lazy Copy Constructore :


    copyco(copyco p1){
        mark=new int[3];
           this.name=p1.name;
             this.password=p1.password;
          

             for(int i=0;i<mark.length;i++){
                this.mark[i]=p1.mark[i];
             }
    }
   copyco(){
    mark=new int[3];

    System.out.println( "constrocture is Running:");
   }

}
