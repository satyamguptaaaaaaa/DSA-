
import java.util.*;

public class pairSum {


    // public static Boolean  PairApproch( ArrayList<Integer>Pair, int target){
    //     for(int i=0; i<Pair.size();i++){
    //         for(int j=i+1; j<Pair.size();j++){
    //             if(Pair.get(i)+Pair.get(j)== target){
    //                 return true;
    //             }
    //         }
    //     }

    //     return false;


    // }


    //// Second Methode USing The two Pointer Value  :

    public static boolean pointer(ArrayList<Integer> height, int target) {
        int lp = 0;
        int re = height.size() - 1;

        while (lp < re) {
            if (height.get(lp) + height.get(re) == target) {
                return true;
            }

            if (height.get(lp) + height.get(re) < target) {
                lp++;
            } else {
                re--;
            }
        }
        return false;
    }


    public static Boolean NewPointer(ArrayList<Integer>height,int target){
        int n=height.size();
        int bp=-1;
         for(int i=0;i<height.size();i++){
        if(height.get(i)>height.get(i+1)){  
         bp=i;
         break;
        };
 

       

         }
         int ls=bp+1;//// Smaller Value

         int rs=bp;//// Larger Value :

         while(ls!=rs){
            if(height.get(ls) + height.get(rs)==target){
               return true;
            }
       
            if(height.get(ls) + height.get(rs)<target){
               ls=(ls+1)%n;
            
            }else{
                rs=(n+rs-1)%n;
            }

         }
         return false;
    }


    public static void main(String[] args) {
        ArrayList<Integer>Pair=new ArrayList<>();
        Pair.add(1);
        Pair.add(2);
        Pair.add(3);
        Pair.add(4);
        Pair.add(7);
        Pair.add(6);
    
        /// this Programe Run not a Liner Time  n(n2) Is It's Time Coplexcity;
        // System.out.println(pointer(Pair, 11));

        //// everything is Possible in this world bro:

        System.out.println(NewPointer(Pair,7));
        
    }}