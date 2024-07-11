public class BuyandSellStock {

    public static int BuyandSellStock(int number[]){
        int Buyprice=Integer.MAX_VALUE;
        int maxprofit=0;
        for(int i=0;i<number.length;i++){
            if(Buyprice<number[i]){
                int profit=number[i]-Buyprice;
                maxprofit=Math.max(maxprofit, profit);


            }else{
                Buyprice=number[i];
            }
        }
        return maxprofit;

    }
    public static void main(String[] args) {
        int number[]={7,2,3,4,5,2};
        int Sell=BuyandSellStock(number);
        System.out.println(Sell);


        
    }
    
}
