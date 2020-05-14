package com.acme.mytrader.constants;

import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

import com.acme.mytrader.model.Stock;

public class Constants {


	public static final Object lock = new Object();
	public static final double SELLING_PRICE = 100.0;
	public static final double BUYING_PRICE = 55.0;
	
	
	public static synchronized  List<Stock> data(){
		List<Stock> stocks = new CopyOnWriteArrayList<Stock>();
		stocks.add(new Stock("A", 100));
		stocks.add(new Stock("B", 55));
		stocks.add(new Stock("C", 88));
		stocks.add(new Stock("D", 75));
		stocks.add(new Stock("E", 90));
		stocks.add(new Stock("F", 92));
		stocks.add(new Stock("Honda Share", 70));
		stocks.add(new Stock("BMW Share", 75));
		stocks.add(new Stock("Honda Share", 97));
		stocks.add(new Stock("Honda Share", 105));
		stocks.add(new Stock("Honda Share", 30));
		stocks.add(new Stock("Honda Share", 45));
		stocks.add(new Stock("Honda Share", 60));
		stocks.add(new Stock("Ford Share", 55));
		stocks.add(new Stock("Ford Share", 45));
		stocks.add(new Stock("Ford Share", 100));
		stocks.add(new Stock("Tesco Share", 17));
		stocks.add(new Stock("Samsung share ", 100));
		stocks.add(new Stock("Tesco Share", 45));
		stocks.add(new Stock("Samsung share ", 55));
		stocks.add(new Stock("Tesco Share", 55));
		stocks.add(new Stock("Asda Share", 45));
		stocks.add(new Stock("Asda Share", 55));
		stocks.add(new Stock("Asda Share", 100));
		stocks.add(new Stock("BMW Share", 117));
		stocks.add(new Stock("BMW Share", 88));
		stocks.add(new Stock("Tesla Share", 200));
		stocks.add(new Stock("Tesla Share", 20));
		stocks.add(new Stock("Gold", 45));
		stocks.add(new Stock("Gold", 200));
		stocks.add(new Stock("BMW Share", 100));
		stocks.add(new Stock("Halifan Bond", 45));
		stocks.add(new Stock("Barcleys Band", 55));
		stocks.add(new Stock("Gold", 17));
		stocks.add(new Stock("Halifan Bond", 190));
		stocks.add(new Stock("Samsung share ", 300));
		stocks.add(new Stock("LLoyds Share", 45));
		stocks.add(new Stock("Barcleys Share", 55));
		stocks.add(new Stock("GBP", 115));
		stocks.add(new Stock("Silver", 150));
		stocks.add(new Stock("Gold", 200));
		stocks.add(new Stock("Halifaf Share", 85));
		stocks.add(new Stock("Apple Share", 200));
		stocks.add(new Stock("Apple Share", 99));
		stocks.add(new Stock("Tesla Share", 150));
		stocks.add(new Stock("Halifan Bond", 175));
		stocks.add(new Stock("Barcleys Band", 150));
		stocks.add(new Stock("LLoyds Bonds", 300));
		stocks.add(new Stock("AUS", 75));
		stocks.add(new Stock("USD", 95));
		return stocks;
		
	}

}
