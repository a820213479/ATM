package com.feicui.atm;

public class User {
	private String userName = "张三";
	private double balance = 1000;
	private String cardNumber = "370120180104";
	private String password = "123456";
	private String dTime;
	private double balance_d;
	private String wTime;
	private double balance_w;
	private String tTime;
	private double balance_t;

	public String getUserName() {
		return userName;
	}

	public Double getBalance() {
		return balance;
	}

	public void setBalance(Double balance) {
		this.balance = balance;
	}

	public String getCardNumber() {
		return cardNumber;
	}

	public String getPassword() {
		return password;
	}

	public String getDtime() {
		return dTime;
	}

	public void setDtime(String dTime) {
		this.dTime = dTime;
	}

	public Double getBalance_d() {
		return balance_d;
	}

	public void setBalance_d(Double balance_d) {
		this.balance_d = balance_d;
	}

	public String getWtime() {
		return wTime;
	}

	public void setWtime(String wTime) {
		this.wTime = wTime;
	}

	public Double getBalance_w() {
		return balance_w;
	}

	public void setBalance_w(Double balance_w) {
		this.balance_w = balance_w;
	}

	public Double getBalance_t() {
		return balance_t;
	}

	public void setBalance_t(Double balance_t) {
		this.balance_t = balance_t;
	}
	public String getTtime() {
		return tTime;
	}

	public void setTtime(String tTime) {
		this.tTime = tTime;
	}
}
