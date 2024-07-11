

public class constrocture {
    
public static void main(String[] args) {
     Oops p1= new Oops();

    p1.Setid(20);
    System.out.println( p1.getid());

     System.out.println(p1.name="Satyam");

     Student p3=new Student();
     Student p4=new Student(12);
     System.out.println(p4.id );

     Student p5=new Student("Sradha Thapra");
     System.out.println( p5.name);



}

}


 class Oops{
    String name;


    private int id;

    int getid(){
        return this.id;
    }

    void Setid(int id){
        this.id=id;
    }




  Oops(){
    /// Constructure :
    // this.name= name;
    System.out.println( "Counstructure is working:");
  }
 }



class Student{
    String name;
    int id;



    Student(){
        System.out.println( "Counstructure IS Called:");
    }
 Student(String  name){
    this.name=name;
 }

 Student(int id){
    this.id=id;
 }
}

