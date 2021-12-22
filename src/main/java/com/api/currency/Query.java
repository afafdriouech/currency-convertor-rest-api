package com.api.currency;

public class Query {

	
	private String srcCurrency;
	private String targetCurrency;
	private Double monetaryValue;
	public String getSrcCurrency() {
		return srcCurrency;
	}
	public void setSrcCurrency(String srcCurrency) {
		this.srcCurrency = srcCurrency;
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
		return "Query [srcCurrency=" + srcCurrency + ", targetCurrency=" + targetCurrency + ", monetaryValue="
				+ monetaryValue + "]";
	}
	
	
}
