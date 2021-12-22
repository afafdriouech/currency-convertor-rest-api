package com.api.currency;

public class Query {

	
	private String sourceCurrency;
	private String targetCurrency;
	private Double monetaryValue;
	
	
	public Query(String srcCurrency, String targetCurrency, Double monetaryValue) {
		super();
		this.sourceCurrency = srcCurrency;
		this.targetCurrency = targetCurrency;
		this.monetaryValue = monetaryValue;
	}
	public String getSrcCurrency() {
		return sourceCurrency;
	}
	public void setSrcCurrency(String srcCurrency) {
		this.sourceCurrency = srcCurrency;
	}
	public String getTargetCurrency() {
		return targetCurrency;
	}
	public void setTargetCurrency(String targetCurrency) {
		this.targetCurrency = targetCurrency;
	}
	public Double getMonetaryValue() {
		return monetaryValue;
	}
	public void setMonetaryValue(Double monetaryValue) {
		this.monetaryValue = monetaryValue;
	}
	@Override
	public String toString() {
		return "Query [source Currency=" + sourceCurrency + ", target Currency=" + targetCurrency + ", monetary Value="
				+ monetaryValue + "]";
	}
	
	
}
