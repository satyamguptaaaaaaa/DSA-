  import java.util.*;

public class BrustForce {
    
///// 

    public static int Brustcase(ArrayList<Integer>Height){
        int totalwater=0;
        for(int i=0;i<Height.size();i++){
            
            for(int j=i+1;j<Height.size();j++){
                int h=Math.min(Height.get(i), Height.get(j));
                int w=j-i;
                int total=w*h;
                totalwater=Math.max(totalwater,total);


            }
        }
        return totalwater;
    }
//// Next way To do Like This Type Of work :
public static int Brustcase2( ArrayList<Integer>Height){
    int j=Height.size()-1;
    int i=0;
    int watercontent=0;
    while( i<j){
        int h=Math.min(Height.get(i), Height.get(j));
        int w=j-i;
       int current=h*w;
       watercontent=Math.max(watercontent,current); 
        if(Height.get(i)<Height.get(j)){
            i++;
        }else{
            j--;
        }
    };

    //// Secon Methode To Doing  like this Type Of Work as Same :
    return watercontent;
};

    public static void main(String []args){
    ArrayList<Integer> Height=new ArrayList<>();
     Height.add(1);
     Height.add(8);
     Height.add(6);
     Height.add(2);
     Height.add(5);
     Height.add(4);
     Height.add(8);
     Height.add(3);
     Height.add(7);
     System.out.println( Brustcase(Height));

  System.out.println(Brustcase2(Height));

    }
}
