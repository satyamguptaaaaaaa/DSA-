// public class PracticeRecurcion {

//     static String arry[]={"Zero","One","two","Three","Four","Five","six","seven","Eight","Nine"};
//     public static void Findkey(int arr[],int key, int i){
//         if(i==arr.length){
//             return;
//         };
//         if(arr[i]==key){
//             System.out.println( i+" ");
//         }
//         Findkey(arr, key, i+1);
//     }

//     public static void String(int n){
//         if(n==0){
//             return;
//         }
//         String(n/10);
//         int lastdigit=n%10;
        
//         System.out.println( arry[lastdigit]);

//     }



//     public static int length(String str){
//         if( str.length()==0){
//             return 1;
//         }
//         return length(str.substring(1))+1;
//     };
//     public static void main(String[] args) {
//      // int arr[] = {3,2,4,5,6,2,7,2,2};
//      // int key=2;
//     // Findkey(arr, key, 0);
//        String(123);
//        String str="satyam";
//        System.out.println( str.substring(1));
//        System.out.println(length(str));
//     };
// };



public class PracticeRecurcion {
    public static void towerOfHanoi(int n, String src, String helper, String dest) {
        if (n == 1) {
            System.out.println("Transfer disk " + n + " from " + src + " to " + dest);
            return;
        };
        // Transfer top n-1 from src to helper using dest as 'helper'
        towerOfHanoi(n - 1, src, dest, helper);
        // Transfer nth from src to dest
        System.out.println("Transfer disk " + n + " from " + src + " to " + helper);
        // Transfer n-1 from helper to dest using src as 'helper'
        towerOfHanoi(n - 1, helper, src, dest);
    };

    public static void main(String args[]) {
        int n = 3;
        towerOfHanoi(n, "A", "B", "C");
    };

};
/// c