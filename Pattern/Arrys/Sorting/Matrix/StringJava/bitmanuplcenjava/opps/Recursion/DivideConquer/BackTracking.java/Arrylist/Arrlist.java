 

import java.util.*;
import java.util.Collection;
 import  java.util.ArrayList;

public class Arrlist {
    //// FIst Quaestion for ArryList.
    public static void  swap(ArrayList<Integer> list,int inx1, int inx2 ){
      int temp=list.get(inx1);
      list.set(inx1,list.get(inx2));
      list.set(inx2,temp);

    }
public static void main(String[] args) {
    ArrayList<Integer> list=new ArrayList<>();
    list.add(2);
    list.add(5);
   list.add(9);
   list.add(3);
   list.add(6);

//    int inx1=1;
//    int  inx2=3;
//    System.out.println(list);
//    swap(list, inx1, inx2);
//    System.out.println(list);
   //// Swap the Number using the Swape Methode :


//    System.out.println(list.size()); 
    // System.out.println( list); 
//     for(int i=0;i<list.size();i++){
//         System.out.print( list.get(i)+" ");
//     }
//  System.out.println( );
    ///// 

    // //// reverce The Arry 
    // for(int i=list.size()-1;i>=0;i--){
    //     System.out.print( list.get(i)+" ");
    // }

    //// Find The Maximum Number :
    // int max =Integer.MIN_VALUE;


//     for(int i=0;i<list.size();i++){
//         int val=list.get(i);
// //     if(max<val){
// //         max=list.get(val);
// // };
// max =Math.max(max, val);
// };
// System.out.println(max);

//// In BUilt methode 
Collections.sort(list);
System.out.println(list);

//// reverse Sort InBult methode :
 Collections.sort(list,Collections.reverseOrder());
 System.out.println(list);
}
}