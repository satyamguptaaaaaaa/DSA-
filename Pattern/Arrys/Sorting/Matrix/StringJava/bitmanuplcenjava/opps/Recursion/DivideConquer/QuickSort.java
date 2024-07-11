public class QuickSort {
    public static void QuickSort( int arry[], int si, int ei){
        if(si>=ei){
            return;
        };
        int pivot=Partion(arry, si, ei);
     QuickSort(arry, pivot+1, ei);
     QuickSort(arry, si, pivot-1);
    }
    public static int Partion(int arry[], int si, int ei){
        int pivot=arry[ei];
        int i=si-1;
        for(int f=si;f<ei;f++){
          if(arry[f]<=pivot){
            i++;
            int temp=arry[i];
            arry[i]=arry[f];
            arry[f]=temp;
          };
        };
        i++;
        int temp=pivot;
        arry[ei]=arry[i];
        arry[i]=temp;
        return i;
    };
    public static void Print(int arry[]){
        for(int i=0; i<arry.length;i++){
            System.out.print(arry[i]+" ");
        };
        System.out.println();
    }
    public static void main(String[] args) {
         int arry[]={2,3,3,2};
   QuickSort(arry, 0, arry.length-1);
   Print(arry);
    }
}
