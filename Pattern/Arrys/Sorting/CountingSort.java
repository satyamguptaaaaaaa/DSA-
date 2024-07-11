public class CountingSort {
    public static void CountingSort(int arry[]){
  int largest=Integer.MIN_VALUE;
  for(int i=0;i<arry.length;i++){
    largest=Math.max(largest, arry[i]);
  };

  int count[]=new int[largest+1];
  for(int i=0;i<arry.length;i++){
    count[arry[i]]++;


  }

  int j=0;
  for(int i=0;i<count.length;i++){
    while (count[i]>0) {
        arry[j]=i;
        j++;
        count[i]--;
        
    };

  };
    };


    public static void countings(int arr[]){
        int largest=Integer.MIN_VALUE;
        for(int i=0;i<arr.length;i++){
        largest= Math.max(largest, arr[i]);

        }

        int count[]=new int[largest+1];
        for(int i=0;i<arr.length;i++){
            count[arr[i]]++;
        }

        int j=0;
        for(int i=0;i<arr.length;i++){
            while (count[i]>0) {
                arr[j]=i;
                j++;
                count[i]--;
                
            }
        }
    }

    public static void PrintSelection(int Arry[]){
        for(int i=0;i<Arry.length;i++){
            System.out.println(Arry[i]);
        }
    }
    public static void main(String[] args) {
        int arry[]={1,4,1,3,2,4,3,7};
        // CountingSort(arry);

        countings(arry);
        PrintSelection(arry);

        
    }
    
}
            