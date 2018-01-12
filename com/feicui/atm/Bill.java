package com.feicui.atm;

import java.util.Scanner;

public class Bill {

	private User user;

	public Bill(User user) {

		this.user = user;
	}

	public void bill() {

		while (true) {
			System.out.println("1.查看存款流水\n2.查看取款流水 \n3.查看转账流水\n4.返回上一层");
			Scanner scanner = new Scanner(System.in);
			String bIndex = scanner.next();
			if (bIndex.equals("1")) {

				Bill_De bd = new Bill_De(user);
				bd.bill_de();

			} else if (bIndex.equals("2")) {
				Bill_Wm bw = new Bill_Wm(user);
				bw.bill_wm();
			} else if (bIndex.equals("3")) {
				Bill_Ta bd = new Bill_Ta(user);
				bd.bill_ta();
			} else if (bIndex.equals("4")) {
				break;
			} else {

			}
		}
	}

}
