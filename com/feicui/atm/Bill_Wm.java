package com.feicui.atm;

import java.util.Scanner;

public class Bill_Wm {
	private User user;

	public Bill_Wm(User user) {

		this.user = user;
	}

	public void bill_wm() {
		here: while (true) {
			System.out.println("取款前金额为:" + user.getBalance_w());
			System.out.println("取款后金额为:" + user.getBalance());
			System.out.println("取款时间为:" + user.getWtime());
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
