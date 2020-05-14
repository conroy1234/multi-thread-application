package com.acme.mytrader.execution;

import com.acme.mytrader.constants.Constants;
import com.acme.mytrader.strategy.TradingStrategy;

public class Execution implements ExecutionService {

	// monitor item ready to be bought
	@Override
	public void buy(String security, double price, int volume) {

		TradingStrategy threadOne = new TradingStrategy();
		try {
			threadOne.monitorBuy();
		} catch (InterruptedException e) {

			e.printStackTrace();
		}
	}

	// monitor item ready to be sold
	@Override
	public void sell(String security, double price, int volume) {
		TradingStrategy threadOne = new TradingStrategy();
		try {
			threadOne.monitorSell();
		} catch (InterruptedException e) {

			e.printStackTrace();
		}

	}

	public static void main(String[] args) {
		Execution execute = new Execution();
		Constants.data().forEach(stock -> {
			execute.buy(stock.getSecurity(), stock.getPrice(), stock.getValuem());
			execute.sell(stock.getSecurity(), stock.getPrice(), stock.getValuem());
		});

	}

}
