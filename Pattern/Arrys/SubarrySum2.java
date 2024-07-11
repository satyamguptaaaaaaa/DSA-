public class SubarrySum2 {
//     public static void SubarrySum2(int Number[]){
//         int currSum=0;
//         int maxValue=Integer.MIN_VALUE;
//         int prefix[]=new int[Number.length];
//         prefix[0]=Number[0];
//         for(int i=1;i<prefix.length;i++){
//             prefix[i]=prefix[i-1]+Number[i];
//             System.out.println(prefix[i]);
          
           
//         };

//         for(int i=0;i<Number.length;i++){
//             int start=i;
//             for(int j=1;j<Number.length;j++){
//                 int end =j;
//                 currSum=start==0?prefix[end]:prefix[end]-prefix[start-1];
//                 if(maxValue<currSum){
//                     maxValue=currSum;
//                 }
//             }
//         }
//          System.out.println("Curret Sum"+currSum);
//         System.out.println("Max VAlue is " +maxValue);
//     };
//     public static void main(String[] args) {
        
//         int Number[]={11,12,13,-11};
//         SubarrySum2(Number);

//  /   }

public static void Subarry(int number[]){
    int currentSum=0;
    int Maxvlue=Integer.MIN_VALUE;
    int prefix[]=new int[number.length];
    prefix[0]=number[0];
    for(int i=1;i<number.length;i++){
        prefix[i]=prefix[i-1]+number[i];

    }


    for(int i=0;i<number.length;i++){
        int start=i;
        for(int j=1;j<number.length;j++){
            int end=j;
            currentSum=start==0?prefix[end]:prefix[end]-prefix[start-1];
            if(Maxvlue<currentSum){
                Maxvlue=currentSum;
            }

        }
    }
    System.out.println("max VAlue is "+ Maxvlue);
}

public static void main(String[] args) {
    int Number[]={11,12,13,-11};
    
Subarry(Number);
}
    
}


///23
// 36
// 25

