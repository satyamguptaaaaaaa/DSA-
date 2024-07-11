public class Occurance {
    public static int Occurance( int arry[],int i , int key){
        if(i==arry.length){
            return -1;
        }
        if(arry[i]==key){
            return i;
        }
      return Occurance(arry, i+1,key);
    }
    public static void main(String[] args) {
        int arry[]={1,2,3,4,6,5};
        int key=5;

        System.out.println( Occurance(arry, 0,key));

    }
}
