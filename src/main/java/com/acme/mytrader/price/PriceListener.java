package com.acme.mytrader.price;



public interface PriceListener {
	
    void buyingPriceUpdate(String security, double price);
    void sellingPriceUpdate(String security, double price);
}
