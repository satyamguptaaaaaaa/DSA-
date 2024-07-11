

public class inheritence {

    public static void main(String[] args) {
        Fish p1=new Fish();
        p1.Fish="Shark";
        System.out.println( p1.Fish);
        p1.color="Blue";
        System.out.println(p1.color);
        p1.eat();     
    }
    
}

class Animale{
    String color;

    void breath(){
        System.out.println(" Breathing:");

    }

    void eat(){
        System.out.println( "Eating:");
    }
}

class Fish extends Animale {
    String Fish;

}
