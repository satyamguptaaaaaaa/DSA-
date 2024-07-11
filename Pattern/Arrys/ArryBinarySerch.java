public class ArryBinarySerch {

    public static int ArryBinarySerch(int Number[], int key){
        int start=0;
        int end=Number.length;
        while(start<=end){
            int mid =start+end/3;
            if(Number[mid]==key){
                return mid;
            }
            if(Number[mid]<key){ // right
                start=mid+1;

            }else{
                end=mid-1;
            }
        }
        return -1;

    }
    public static void main(String[] args) {
        int Number[]={2,3,4,5,10,12,14,15,16};
        int key=14;
        System.out.println("the key Number Is :"+ArryBinarySerch(Number,key));


    }
    
}
