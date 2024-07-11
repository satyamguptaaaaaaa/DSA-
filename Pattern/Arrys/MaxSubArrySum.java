public class MaxSubArrySum {
    public static void MaxSubArrySum(int Number[]){
        int maxvlue=Integer.MIN_VALUE;
        for(int i=0;i<Number.length;i++){
            for(int j=i;j<Number.length;j++){
                int sumarry=0;
                for(int k=i;k<=j;k++){
                    sumarry+=Number[k];
                }
                System.out.print("SumArry " +sumarry+" ");
                if(maxvlue<sumarry){
                    maxvlue=sumarry;
                }
            }
            System.out.println();
        }
        System.out.println("the Max Value IS "+maxvlue);
    };


    public static void subArry(int Number[]){
    for(int i=0;i<Number.length;i++){
        for(int j=i;j<Number.length;j++){
            for(int k=i;k<=j;k++){
                System.out.print(Number[k]+" ");
            }
            System.out.println();
        }
        System.out.println();
    }
    }
    public static void main(String[] args) {
        int number[]={1,3,4,5,6};
       
        MaxSubArrySum(number);
    }
}
