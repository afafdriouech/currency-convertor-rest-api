package com.api.currency.model;

public class ResultBody {

	private Boolean success;
	private Query query;
	private Double result;
	
	
	public ResultBody(Boolean success, Query query, Double result) {
		super();
		this.success = success;
		this.query = query;
		this.result = result;
	}
	public Boolean getSuccess() {
		return success;
	}
	public void setSuccess(Boolean success) {
		this.success = success;
	}
	public Query getQuery() {
		return query;
	}
	public void setQuery(Query query) {
		this.query = query;
	}
	public Double getResult() {
		return result;
	}
	public void setResult(Double result) {
		this.result = result;
	}
	@Override
	public String toString() {
		return "ResultBody [success=" + success + ",\n query=" + query + ",\n result=" + result + "]";
	}
	
	
}
