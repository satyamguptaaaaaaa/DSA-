
import java.util.*;

public class BubbleSort {
    public static void BubbleSort(int Arry[]){
    for(int i=0;i<Arry.length-1;i++){
        for(int j=0;j<Arry.length-1-i;j++){
             if(Arry[j]>Arry[j+1]){
          int temp=Arry[j];
          Arry[j]=Arry[j+1];
          Arry[j+1]=temp;
        
             }
          
        }
    }
    };

    public static void PrintArry(int Arry[]){
        for(int i=0;i<Arry.length;i++){
            System.out.println(Arry[i]);
        }
    }
    public static void main(String[] args) {
        int arry[]={5,4,3,2,1};
        BubbleSort(arry);
        PrintArry(arry);
    }

    
    
}
