package com.feicui.atm;

import java.util.Scanner;

public class Bill_Ta {

	private User user;

	public Bill_Ta(User user) {

		this.user = user;
	}

	public void bill_ta() {
		here: while (true) {
			System.out.println("转账前金额为:" + user.getBalance_t());
			System.out.println("转账后金额为:" + user.getBalance());
			System.out.println("转账时间为:" + user.getTtime());
			System.out.println("返回上一层请按1");
			Scanner scanner = new Scanner(System.in);

			while (true) {
				String s = scanner.next();
				if (s.equals("1")) {
					break here;
				} else {
					System.out.println("输入有误,请重新输入!");
				}
			}
		}
	}
}
