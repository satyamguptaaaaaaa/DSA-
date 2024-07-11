

public class SelctionSort {
    public static void SelctionSort(int Arry[]){
        for(int i=0;i<Arry.length-1;i++){
            int min=i;
            for(int j=i+1;j<Arry.length;j++){
                if(Arry[min]>Arry[j]){
                    min =j;
                }
            }
            int temp=Arry[min];
            Arry[min]=Arry[i];
            Arry[i]=temp;

        };
    };

    public static void PrintSelection(int Arry[]){
        for(int i=0;i<Arry.length;i++){
            System.out.println(Arry[i]);
        }
    }
    public static void main(String[] args) {
        int Arry[]={5,4,3,2,1};
        SelctionSort(Arry);
        PrintSelection(Arry);
    }
    
}
