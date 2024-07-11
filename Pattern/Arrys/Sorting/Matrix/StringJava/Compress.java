public class Compress {

    /// Not Using String Builder :
//     public static String Copress(String Str){
//         String string="";
//             for(int i=0;i<Str.length();i++){
//                 Integer count =1;
//                 while (i<Str.length()-1 && Str.charAt(i)== Str.charAt(i+1)) {
//                count++;
//                i++; };
//        string+=Str.charAt(i);
//        if(count>1){
//         string+=count;
//        }
//  }
// return string;
//  }


public static String Copress(String Str){
    StringBuilder sc=new StringBuilder("");
        for(int i=0;i<Str.length();i++){
            Integer count =1;
            while (i<Str.length()-1 && Str.charAt(i)== Str.charAt(i+1)) {
           count++;
           i++; };
  sc.append(Str.charAt(i));
   if(count>1){
   sc.append(count);
   }
}
return sc.toString();
}
    public static void main(String[] args) {
        
        String str="sstyyym";
        System.out.println(Copress(str));
    }
    
}
