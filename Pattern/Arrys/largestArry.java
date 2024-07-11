
import java.util.*;
public class largestArry {
    public static int lagestSmall(int number[]){
        int larger=Integer.MIN_VALUE;
        int smallest=Integer.MAX_VALUE;
        for(int i=1;i<number.length;i++){
            if(larger<number[i]){
                larger=number[i];  
            }
            if(smallest>number[i]){
                smallest=number[i];
            }
        }
        System.out.println("smallest is "+smallest);
        return larger;
    }
    public static void main(String[] args) {
        int number[]={23,44,22,12,32,55,45,54,65,56,55,33};
        System.out.println(number.length);
        System.out.println("the larger value is "+lagestSmall(number));

    }
    
}
