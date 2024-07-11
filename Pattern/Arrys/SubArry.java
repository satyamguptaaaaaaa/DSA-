public class SubArry {
    
    public static void SubArry(int Number[]){
        for(int i=0;i<Number.length;i++){
            int start=i;
            for(int j=i;j<Number.length;j++){
             int end=j;

             for(int k=start;k<end;k++){
                System.out.print(Number[k]+" ");
             }
             System.out.println();
            }
            System.out.println();
        }

    }

    /// Subarry Print Using Nested
    public static void main(String[] args) {
        int Number[]={12,3,44,44,55,56};
        SubArry(Number);
        
    }
}
