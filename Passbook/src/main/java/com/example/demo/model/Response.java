package com.example.demo.model;

public class Response {
	
	private boolean success;
	private String result;
	
	public boolean isSuccess() {
		return success;
	}
	public void setSuccess(boolean success) {
		this.success = success;
	}
	public String getResult() {
		return result;
	}
	public void setResult(String result) {
		this.result = result;
	}
	public Response(boolean success, String result) {
		super();
		this.success = success;
		this.result = result;
	}
	
	public Response() {}

}
