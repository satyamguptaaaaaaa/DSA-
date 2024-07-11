public class OccurenceLastindex {

    public static int LAstIndex(int i, int key , int arry[]){
        if(i==arry.length){
            return -1;
        }
        int IsFound=LAstIndex(i+1, key, arry);
        if (   IsFound ==-1 &&  arry[i]==key ){
             return i;
        }
        return IsFound;
    };
    public static void main(String[] args) {
        int arry[]={1,2,3,4,5,4,55,4};
        int key=4;
        System.out.println( LAstIndex(0, key, arry));
    };
};

///  Hum Me Koi Samarthya Nhi hehe ke tumai Batau sun pe
