public class BestTimeStockByI {
    public static void main (String[] args){
        int []a = {7,1,5,6,4};

        int maxProfit = 0, minBuy = Integer.MAX_VALUE;
        for (int i =0;i<a.length;i++){
            minBuy = Math.min(minBuy,a[i]);
            maxProfit= Math.max(maxProfit,a[i]-minBuy);
        }
        System.out.println(maxProfit);

    }
}
