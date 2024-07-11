


public class sAbstract {
    public static void main(String[] args) {

        Horse h=new Horse();
        h.eat();
        h.walk();
        h.changecolor();
        System.out.println( h.color);

        Chicken c = new Chicken();
        c.eat();
        c.walk();
        c.changecolor();
        System.out.println(c.color);
        
    }
}


 abstract class Animal{

    String color;

    // Put the value inside the constructore :

    Animal( String color  ){
        color="blue";

    }

    Animal( ){
        System.out.println( "The Constructore Is running :");

    }
    void eat(){
        System.out.println( "Aniaml Is Eating:");
    };


//// make the Idea :
     abstract void walk();
 }

/**
 * InnersAbstract
 */
class Horse extends Animal {
    // Corrected method name to 'walk'
    Horse(){
        System.out.println( "the constructore Is running :");
    }
    void changecolor(){
        color ="BlackBrown";
    }
    void walk() {
        System.out.println("The Horse has 4 legs.");
    }

    void smart(){
        System.out.println( "its Very smrat:");
    }
};


class Chicken extends Animal{

    Chicken (){
        System.out.println( "the Constructore Is running :");
    }
     void changecolor(){

        color ="Yellow";
     }
    void walk() {
        System.out.println( "Chicken walk on 2 leg:");    
    }

}

