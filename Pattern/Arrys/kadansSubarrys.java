public class kadansSubarrys {

    public static void kadans(int number[]){
        int mx=Integer.MIN_VALUE;
        int Add=0;
        for(int i=0;i<number.length;i++){
      Add=Add+number[i];
      if(Add<0){
       Add=0;
      }
      mx=Math.max(Add, i);
    }

    System.out.println("Max Value Is "+mx);


        
    }

    public static void main(String[] args) {
        int Number[]={-2,-3,4,-1,-2,1,5,-3};
        kadans(Number);
    }
    
}
