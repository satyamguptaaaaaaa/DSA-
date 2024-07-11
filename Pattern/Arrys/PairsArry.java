
import java.util.*;
public class PairsArry {
    public static void PairsArry(int Number[]){
     for(int i=0;i<Number.length;i++){
        int curr=Number[i];
        for(int j=i+1;j<Number.length;j++){
            System.out.print("("+ curr +" , "+Number[j]+ " )");
        }
        System.out.println();
    }
        
    }
    public static void main(String[] args) {
        int Number[]={2,4,5,6};
        PairsArry(Number);
    };
};
