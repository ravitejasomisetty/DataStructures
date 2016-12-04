package com.Arrays;

public class BuySellStock {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] sPrice ={310,315,275,295,260,270,290,230,255,250};
		int[] pri = {993,543,113,584,817,582,638,174,368,830,97,715,175};
		findMaxProfitBuySellOneDay(pri);
		findMaxProfitBuySellTwoDay(sPrice);
		findMaxProfit(pri);
	}

	private static void findMaxProfitBuySellTwoDay(int[] sPrice) {
		// TODO Auto-generated method stub
		int maxProfit = 0,count = 0 ;
		int minPrice = Integer.MAX_VALUE;
		int[] maxProfitAlldays = new int[sPrice.length];
		for(int stock : sPrice){
			int profit = stock - minPrice;			
			minPrice = Math.min(minPrice, stock);
			maxProfit = Math.max(maxProfit,profit );
			maxProfitAlldays[count++] = maxProfit;
		}
		for(int price  : maxProfitAlldays)
			//System.out.print(price+ " ");
			maxProfit = 0;
		for(int i = maxProfitAlldays.length-1;i>0;i--){
			int maxPrice = Math.max(maxProfit, sPrice[i]);
			//System.out.println((maxPrice - sPrice[i] +maxProfitAlldays[i-1]));
			maxProfit = Math.max(maxProfit, (maxPrice - sPrice[i] +maxProfitAlldays[i-1]));

		}
		System.out.println("zf: "+maxProfit);
	}

	private static void findMaxProfitBuySellOneDay(int[] sPrice) {
		// TODO Auto-generated method stub
		int maxProfit = 0;
		int minPrice = Integer.MAX_VALUE;int buy = 0,sell = 0,finBuy = 0;
		for(int stock : sPrice){
			int profit = stock - minPrice;
			if(minPrice > stock){
				buy = stock;
				minPrice = Math.min(minPrice, stock);
			}
			if(maxProfit<profit){
				sell = stock;
				finBuy = buy;
				maxProfit = Math.max(maxProfit,profit );
			}
		}
		System.out.println("buy : "+finBuy + " sell: "+sell);
		System.out.println(maxProfit);
	}
	private static void findMaxProfit(int[] values){
		double max = Integer.MIN_VALUE,maxDiff = Integer.MIN_VALUE, diff = 0;
		double bottom = values[0];
		double sell = 0,buy = 0;
		for (int i = 1; i < values.length; i++)
		{
			diff += values[i] - values[i - 1];

			if (diff > maxDiff)
			{
				maxDiff = diff;
				max = values[i];
				sell = i;
			}

			if (values[i] < bottom)
			{
				bottom = values[i];
				diff = 0;
			}
		}
		buy = (max - maxDiff);
		for(int i  = 0 ;i<values.length && i<sell;i++ ){
			if(buy == values[i]){
				buy = i;break;
			}
		}
		System.out.println("buy : "+ (max  - maxDiff) + " sell : "+max);
		System.out.println(((int)(buy+1))+" BUY\n" +(int)(sell+1)+ " SELL");
	}

}
