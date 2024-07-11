public class Binary {
    public static void BinaryString( int n, String str,int latvalue){
 if(n==0){
    System.out.println(str);
     return;
 };
        BinaryString(n-1, str+"0", 0);
        if(latvalue==0){
            BinaryString(n-1, str+"1", 1);
        };
    };
    public static void main(String[] args) {
         BinaryString(3,"", 0);
    };
};
