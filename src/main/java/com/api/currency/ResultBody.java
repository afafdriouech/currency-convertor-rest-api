package com.api.currency;

public class ResultBody {

	private String success;
	private Query query;
	private Double result;
	public String getSuccess() {
		return success;
	}
	public void setSuccess(String success) {
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
		return "ResultBody [success=" + success + ", query=" + query + ", result=" + result + "]";
	}
	
	
}
