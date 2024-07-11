public class newSuper {
    public static void main(String[] args) {
        Horse H= new Horse();
        System.out.println( H.name);
        System.out.println(H.leg);
    };
};


class Animal{
    String name;
    int leg;
    Animal(){
        System.out.println( "Constructore Is Called :");
    };
};
class Horse extends Animal {
Horse(){
    super.name="Satyam";
    super.leg=10;
}
}


