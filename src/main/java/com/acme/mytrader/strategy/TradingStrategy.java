package com.acme.mytrader.strategy;
import com.acme.mytrader.price.impl.PriceListnerImpl;
import com.acme.mytrader.price.impl.PriceSourceImpl;

/**
 * <pre>
 * User Story: As a trader I want to be able to monitor stock prices such
 * that when they breach a trigger level orders can be executed automatically
 * </pre>
 */
public class TradingStrategy {	
	
	
	/*
	 * monitor collection of stock and execute a buy 
	 */
	
	public void monitorBuy() throws InterruptedException {
		PriceSourceImpl priceSourceImpl= new PriceSourceImpl();
		 Runnable run = () -> {
			 priceSourceImpl.addPriceListener(new PriceListnerImpl());
		    };
		    
		    Thread buyingThread = new Thread(run);		   
		    buyingThread.start();
		   
	}
	
	public void monitorSell() throws InterruptedException {
		PriceSourceImpl priceSourceImpl= new PriceSourceImpl();
		 Runnable run = () -> {
			 priceSourceImpl.removePriceListener(new PriceListnerImpl());
		    };
		    
		    Thread selling = new Thread(run);		    
		    selling.start();
		    
	}
}
