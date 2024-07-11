public class sortingrecu {
    
    public static Boolean sortingarry(int arry[], int i){
        if(i==arry.length-1){
        return true;
        }
        
        if(arry[i]>arry[i+1]){
        return false;
        }
        
        return sortingarry(arry,i+1);
        }
        
        
        
        
        public static void main(String args[]){
        int arry[]={1,4,3,4,5};
        System.out.println(sortingarry(arry, 0));
        
        /// Output :: False  
        /// means arry is Not arrnge the Sorted order: 
        
        }
}
