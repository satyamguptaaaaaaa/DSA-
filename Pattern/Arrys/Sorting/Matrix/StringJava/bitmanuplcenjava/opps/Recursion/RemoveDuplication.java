public class RemoveDuplication {

    public static void RemoveDuplication( String str, boolean map[], int inx, StringBuilder newstring ){
      if(inx== str.length()){
        System.out.println(newstring);
         return;
      };

     char Current = str.charAt(inx);
     if(map[Current-'a']== true){
         RemoveDuplication(str, map, inx+1, newstring);
     }
     else{
        map[Current-'a']=true;
        RemoveDuplication(str, map, inx+1, newstring.append(Current));
     };


    }
    public static void main(String[] args) {
        String str="apannacollagee";
        

        RemoveDuplication(str,new boolean[26], 0, new StringBuilder(""));

    }
}
