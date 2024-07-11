public class Touppercase {


    /// This question is not very easy bro what i am solve this question:
    public static  String ToUppercase(String str){
        StringBuilder sc =new StringBuilder("");
        char ch=Character.toUpperCase(str.charAt(0));
        sc.append(ch);
        for(int i=1;i<str.length();i++) {
            if(str.charAt(i) == ' ' && i<str.length()-1){
               sc.append(str.charAt(i));
               i++;
               sc.append(Character.toUpperCase(str.charAt(i)));
            

            }else{
                sc.append(str.charAt(i));
            }
        }
        return sc.toString();
    }

    public static void main(String[] args) {
         
    String str="hii, my name is satyam";
    System.out.println(str.length());
      /// Normally Conver to the upper case :
    System.out.println(  str.toUpperCase());




    System.out.println(ToUppercase(str));
    }
    
}