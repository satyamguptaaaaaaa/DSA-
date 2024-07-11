public class ppStatic {
    public static void main(String[] args) {

        Animal A=new Animal();

        /// Animal Funcation Using :
        A.name="satyam";
    System.out.println(A.getname());

    A.setleg(12);
    System.out.println( A.getleg());

    Animal B=new Animal(A);
    System.out.println( B.leg);
    System.out.println( B.name);


    };
};
class Animal{
     String name;
      static int leg;

     void setleg( int leg){
        this.leg=leg;
     }

     int getleg(){
        return this.leg;
     }
    void setname(String name){
        this.name =name;
    };
  

    Animal(){

    }

    Animal( Animal A){
        this.name=A.name;


    }

    String getname(){
        return this.name;
    }
}
