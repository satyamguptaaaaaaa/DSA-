public class Revercearrry {

    public static void Revercearrry(int Number[]){
        int start=0;
        int end=Number.length-1;
 while(start<end){
    int temp=Number[end];
   Number[end] =Number[start];
   Number[start]=temp;
    end--;
    start++;
 }

    }
    public static void main(String[] args) {
        // Revers the arry Using time complexcity


        int Number[]={2,4,5,6,7,8,9,7};
     Revercearrry(Number);

        for(int i=0;i<Number.length;i++){
            System.out.print(Number[i]+" ");
        }
        System.out.println();




        
    }
}
