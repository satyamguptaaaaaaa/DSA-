public class NewInterfaces {

    public static void main(String[] args) {
      System.out.println( "Deer Ke Liye :");
        Deer d= new Deer();
        d.garss();

        System.out.println( "Beer ke Liye :");
        Beer B= new Beer();
        B.chicken();
        B.garss();
         
    }
    
}

/**
 *  
 */
 interface  Hrvivore   {
 void garss();  
}

/**
 * InnerNewInterfaces
 */
interface Crnivore  {
    void chicken();
 
};



class Deer implements Hrvivore{
    public void garss(){
        System.out.println( "Eat Grasss:");
    }
}

class Beer implements Hrvivore,Crnivore{
     public void garss(){

        System.out.println(" Eat a grass :");
     }
     public void chicken(){
        System.out.println( " Eat a Chicken:");

     }
}

