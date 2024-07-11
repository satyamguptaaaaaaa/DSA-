

public class arryback {

    public static void backTraking(int arry[],int i, int val){
// base Condition:
if(i==arry.length){
    System.out.print(arry);
    return;
}
        arry[i]=val;
        backTraking(arry, i+1, val+1);
        /// backttaking Process:
        arry[i]=arry[i]-2;


    }

    public static void Print(int arry[]){
        for(int i=0;i<arry.length;i++){
            System.out.print(arry[i]+" ");
        }
        System.out.println();

    }

    public static void main(String[] args) {
        int arry[]=new int[5];
        backTraking(arry, 0, 1);
        Print(arry);

    }
    
}
