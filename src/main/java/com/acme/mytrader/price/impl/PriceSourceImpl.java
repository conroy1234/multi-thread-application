package com.acme.mytrader.price.impl;

import java.util.List;


import com.acme.mytrader.constants.Constants;
import com.acme.mytrader.model.Stock;
import com.acme.mytrader.price.PriceListener;
import com.acme.mytrader.price.PriceSource;


public class PriceSourceImpl implements PriceSource {
	PriceListnerImpl priceListnerImpl = new PriceListnerImpl();	
	public static final List<Stock> STOCKS = Constants.data();
	
	
	@Override
	public void addPriceListener(PriceListener listener) {

		synchronized (Constants.lock) {
			while (true) {
				STOCKS.forEach(stock -> {					
					priceListnerImpl.buyingPriceUpdate(stock.getSecurity(), stock.getPrice());
				});
			}

		}

	}

	@Override
	public void removePriceListener(PriceListener listener) {
		synchronized (Constants.lock) {
			while (true) {
				STOCKS.forEach(stock -> {					
					priceListnerImpl.sellingPriceUpdate(stock.getSecurity(), stock.getPrice());

				});
			}
		}

	}

}
