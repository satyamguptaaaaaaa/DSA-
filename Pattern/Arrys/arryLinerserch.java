
import java.util.*;

public class arryLinerserch {
//     public static int LinerSerch(int marks[], int key){
//         for(int i=0;i<marks.length;i++){
//             if(marks[i]==key){
//                 return i;

//             }
            
//         }
//         return -1;

//     }
//     public static void main(String[] args) {
//         int marks[] = {10,20,40,50,60};
//         int key=70;
//      int index=LinerSerch(marks,key);
//      System.out.println(index);
// //    if(index==-1){
// //     System.out.println("Not Found:");
// //    }else{
// //     System.out.println("KeyS index is "+index);
// //    }
     

      

//     }

public static int froits(String fruits[], String key){
for(int i=0;i<fruits.length;i++){
    if(fruits[i]==key){
        return i;
    }
}
return -1;

}
public static void main(String[] args) {
    String fruits[]={"Mango","banana","papaya","graps"};
    String key="graps";
    int index= froits(fruits, key);
    if(index==-1){
        System.out.println("Not Found");
    }else{
        System.out.println("The Fruite index is "+index);
    }
}
    
 }

