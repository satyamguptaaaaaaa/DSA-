
import java.util.*;

public class insertingSortCode {
    public static void insertionSort(int arr[]) {
        for (int i = 1; i < arr.length; i++) {
            int curr = arr[i];
            int prev = i - 1;
    
            // Shift elements greater than curr to the right
            while (prev >= 0 && arr[prev] > curr) {
                arr[prev + 1] = arr[prev];
                prev--;
            }
    
            // Insert curr at the correct position
             arr[prev + 1] = curr;
        }
    }

    public static void PrintSelection(int Arry[]){
        for(int i=0;i<Arry.length;i++){
            System.out.println(Arry[i]);
        }
    }
    public static void main(String[] args) {
        int arry[]={5,4,1,3,2};
 insertionSort(arry);
  PrintSelection(arry);
        
    }
    
}
