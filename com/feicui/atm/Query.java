package com.feicui.atm;

public class Query {
	private User user;

	public Query(User user) {
		this.user = user;
	}

	public void query() {

		System.out.println("账户姓名:" + user.getUserName());
		System.out.println("余额:" + user.getBalance());

	}

}
