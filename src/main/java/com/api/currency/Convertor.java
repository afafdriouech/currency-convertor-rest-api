package com.api.currency;

import java.util.HashMap;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public class Convertor {
	
	private String base;
	private HashMap<String,Double> rates;
	
	public String getBase() {
		return base;
	}



	public void setBase(String base) {
		this.base = base;
	}



	public HashMap<String, Double> getRates() {
		return rates;
	}



	public void setRates(HashMap<String, Double> rates) {
		this.rates = rates;
	}



	@Override
	public String toString() {
		return "Convertor [base=" + base + ", rates=" + rates + "]";
	}
	

}
