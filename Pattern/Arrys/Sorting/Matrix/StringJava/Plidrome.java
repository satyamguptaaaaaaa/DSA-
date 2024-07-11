public class Plidrome {

    public static boolean Plidrome(String name ){
        for(int i=0;i<name.length()/2;i++){
            int n=name.length();
            if(name.charAt(i)!=name.charAt(n-1-i)){
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args) {
        String name="tat";
        System.out.println( Plidrome(name));
        
    }
    
}
