public class StringCompare {
public static void main(String[] args) {
    
    String str[]={"apple","mango","banana"};
    String larger=str[0];
    for(int i=1;i<str.length;i++){
        if(larger.compareTo(str[i])<0){
            larger=str[i];
        }
    }
    System.out.println(larger);
}


    
}
