public class Roated {


    public static int Roated(int arry[], int tar, int si, int ei ){
         int mid=(si+ei)/2;
         if(si>ei){
            return -1;
         }
         if(arry[mid]==tar){
            return mid;
         };

         if(arry[si]<arry[mid]){
            if(arry[si]<=tar && tar<=arry[mid] ){
               return Roated(arry, tar, si, mid-1);

            }else{
               return  Roated(arry, tar, mid+1, ei);
            }
         }
         else{
            if(arry[mid]<=tar && tar<=ei){
               return  Roated(arry, tar, mid+1, ei);
            }else{
                return Roated(arry, tar, si, mid-1);
            }
         }
    }
    public static void main(String[] args) {
        int arry[]={1,2,4,5,5,6,7};
        System.out.println( Roated(arry, 2, 0, arry.length-1));
        
    };
};