public class Tringle {
    public static void ZerooneTringle(int n){
        for(int i=1;i<=n;i++){
            for(int j=1;j<=i;j++){
                if ((i+j)%2==0) {
                    System.out.print("1"+" ");
                }else{
                    System.out.print("0"+" ");
                }
            
            }
            System.out.println();
        }
    }
//Output:
// 1 
// 0 1
// 1 0 1
// 0 1 0 1
// 1 0 1 0 1
 
    public static void main(String[] args) {
        
 ZerooneTringle(5);
    }
    
}
