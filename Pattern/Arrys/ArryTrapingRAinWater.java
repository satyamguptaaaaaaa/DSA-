public class ArryTrapingRAinWater {
//     public static int ArryTrapingRAinWater(int Height[]){
//         int  n=Height.length;
//         int right[]=new int[Height.length];
//         right[0]=Height[0];

//         /// left Arry:
//         for(int i=1;i<n;i++){
//             right[i]=Math.max(Height[i], right[i-1]);
//         };

//         ///Right Arry:
// int Left[]=new int[Height.length];
// Left[n-1]=Height[n-1];
//         for(int i=n-2;i>=0;i--){

//        Left[i]=Math.max(Height[i],Left[i+1]);

//         };

        
//         int Totalwater=0;
//         for(int i=0;i<n;i++){
           
         

//            int  waterlevel=Math.min(right[i],Left[i]);
//             Totalwater+=waterlevel-Height[i];

//         }
//         return Totalwater;




//     }

public static int TrapingRAinWater(int  height[]){
    int n=height.length;

    //// Left Side arry:
    int leftSide[]=new int[height.length];
    leftSide[0]=height[0];
    for(int i=1;i<n;i++){
        leftSide[i]= Math.max(height[i],leftSide[i-1]);
    };
    // Right Side Arry:
    int rightSide[]=new int[height.length];
    rightSide[n-1]=height[n-1];
    for(int i=n-2;i>=0;i--){
        rightSide[i]=Math.max(height[i],rightSide[i+1]);
    };
    int trapwater=0;
    for(int i=0;i<n;i++){
        int waterlevel= Math.min(leftSide[i],rightSide[i]);
    trapwater=trapwater+waterlevel-height[i];
    };

    return trapwater;

}

    public static void main(String[] args) {
        int number[]={4,2,0,6,3,2,5};
       int totalwater=TrapingRAinWater(number);
       System.out.println(totalwater);

    


        
    }
}
