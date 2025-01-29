package Practice2025;

public class BestTimeToBuySellStock {
    public static void main(String[] args) {
        int[] prices = {7, 1, 5, 3, 10, 4};

        int min=Integer.MAX_VALUE;
        int min_index=0;
        int max=0;
        int max_index=0;

        for (int i=0; i<prices.length;i++){
            if(prices[i]<min){
                min=prices[i];
            }
            if(prices[i]-min>max){
                max=prices[i]-min;
            }
        }
        System.out.println(max);


    }
}
