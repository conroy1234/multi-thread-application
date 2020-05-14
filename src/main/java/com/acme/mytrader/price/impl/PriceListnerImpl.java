package com.acme.mytrader.price.impl;

import java.util.List;

import com.acme.mytrader.constants.Constants;
import com.acme.mytrader.model.Stock;
import com.acme.mytrader.price.PriceListener;


public class PriceListnerImpl implements PriceListener {
	

	public static final List<Stock> STOCKS = Constants.data();
	
	
	
	
	@Override
	public void sellingPriceUpdate(String security, double price) {		
		
		if (price < Constants.SELLING_PRICE) {
			System.out.println(" waiting to sell :" );				
			Constants.lock.notify();

		} else {
			Stock stock = new Stock(security,price);
			System.out.println(" ITEM HAS BEEN SOLED -> : " + stock);
			STOCKS.add(stock);
			try {
				Constants.lock.wait();
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
	
	@Override
	public void buyingPriceUpdate(String security, double price) {
		if (price > Constants.BUYING_PRICE) {
			
			System.out.println(" waiting to buy ");
			Constants.lock.notify();
		} else {
			Stock stock = new Stock(security,price);
			System.out.println(" BUY NEW ITEM > : " +  stock);
			STOCKS.remove(stock);
			try {
				Constants.lock.wait();
			} catch (InterruptedException e) {

				e.printStackTrace();
			}
		}
		
	}
	
	

	


}
