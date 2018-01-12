package com.feicui.atm;

import java.util.Scanner;

public class Menu {

	private User user;

	public void Login(User user) {
		this.user = user;
	}

	public void choiceMenu(User user) {
		// 进入菜单页面,进行功能选择,1.查询2.转账3.取款4.存款5.退卡
		while (true) {
			System.out.println("请选择要办理的业务");
			System.out.println("******************************");
			System.out.println("1.查询\n2.转账\n3.取款\n4.存款\n5.退卡\n6.流水");
			System.out.println("******************************");

			Scanner scanner = new Scanner(System.in);

			String index = scanner.next();
			if (index.equals("1")) {
				// 如果选择1.查询,进去信息查询界面进行操作
				Query queryMenu = new Query(user);
				queryMenu.query();
				System.out.println("返回上一级请按  1");
				// 选择返回上一层按键 1 时,从查询界面返回菜单界面,输入其他字符提示:输入有误,请重新输入!
				while (true) {
					String returnMenu = scanner.next();
					if (returnMenu.equals("1")) {
						break;
					} else {
						System.out.println("输入有误,请重新输入!");
						continue;
					}
				}
			} else if (index.equals("2")) {
				// 选择2.转账时,进入转账功能页面进行操作
				TransferAccounts ta = new TransferAccounts(user);
				ta.transferAccounts();

			} else if (index.equals("3")) {
				// 选择3.取款时,进入取款功能页面进行操作
				WithdrawMoney wm = new WithdrawMoney(user);

				wm.withdrawMoney();

			} else if (index.equals("4")) {

				Deposit de = new Deposit(user);
				de.deposit();

			} else if (index.equals("5")) {

				ServiceMain serviceMain = new ServiceMain();
				serviceMain.Login();
			} else if (index.equals("6")) {
				// 选择6.
				Bill b = new Bill(user);
				b.bill();

			} else {
				System.out.println("输入有误,请重新输入!");
			}
		}
	}
}
