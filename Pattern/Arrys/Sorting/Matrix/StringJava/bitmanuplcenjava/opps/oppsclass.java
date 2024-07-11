

public class oppsclass {
  public static void main(String[] args) {
    Opps p1=new Opps();
    p1.setcolor("Blue");
    System.out.println( p1.getColor());

    p1.settip(23);
    System.out.println(p1.getTip());

    // p1.getColor()="yellow";
    System.out.println(p1.getColor());

    // Student p2=new Student();

    // System.out.println( p2.parcentage(20, 20, 20));
    // System.out.println( p2.name="satyam");


    BankAccount  p3=new BankAccount();
    System.out.println( p3.name="Tanu Gupta");

 p3.Setpassword(23) ;

 System.out.println( p3.getpassword());

  }
    
}

 class Opps{
 private String color;
 private int tip;
  public String getColor() {
      return this.color;
  }

  public int getTip() {
      return this.tip;
  }

void setcolor(String newcolor){
color=newcolor;

}

void settip(int newtip){
  tip=newtip;
}



}

class Student{
    String name;
    int id;
    float aver;


    float parcentage(int math, int english, int hindi){
         aver=(math+hindi+english)/3;
         return aver;
    }

}



class BankAccount{
  public  String name;
   private int password;
 public int getpassword(){
    return this.password;
 }
    void Setpassword(int setPassword){
    password=setPassword;
   }



}
