
 import java.util.*;
public class enterface {
    public static void main(String []args){
         Queen Q=new Queen();
         Q.moves();


         King K=new King();
         K.moves();



    }
    
}
/**
 *  
 */
 interface chessplayer   {


    /// provide the idea of class:
    void moves();

    
}

class Queen implements chessplayer {
  public void moves(){
    System.out.println( "up, Down , Left , Right paldrone , (4 steps.)");
  }
}



//// Using The Interfaces :
class King implements chessplayer{
    public void moves(){
        System.out.println( "Up,down ,left ,right,paldrone (2 step.)");
    }
}


 
