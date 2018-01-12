package com.feicui.atm;

import java.util.Scanner;

public class ServiceMain {
	public static void main(String[] args) {

		ServiceMain serviceMain = new ServiceMain();

		serviceMain.Login();
	}

	public void Login() {

		User user = new User();

		while (true) {

			Scanner scanner = new Scanner(System.in);
			System.out.println("欢迎使用ATM自动存取款机");
			System.out.println("请输入账号:");
			String CardNumber = scanner.next();

			if (CardNumber.length() == 12) {

				if (CardNumber.equals(user.getCardNumber()) || CardNumber.equals("370120180108")) {

					System.out.println("请输入密码:");
					String Password = scanner.next();
					if (Password.equals(user.getPassword())) {

						System.out.println("登录成功!");
						Menu meun = new Menu();
						meun.choiceMenu(user);

					} else {

						System.out.println("密码错误");
					}
				} else {
					System.out.println("该用户不存在,请重新输入!");
				}

			} else {
				System.out.println("账号输入长度有误,请重新输入!");
			}

			/*
			 * while (true) {
			 * 
			 * if (CardNumber.equals(user.getCardNumber())) {
			 * 
			 * if (Password.equals(user.getPassword())) {
			 * 
			 * System.out.println("登录成功!"); Menu meun = new Menu(); meun.choiceMenu(); }
			 * else { System.out.println("账号或密码输入有误,请重新输入!"); break;
			 * 
			 * } } else { System.out.println("账号或密码输入有误,请重新输入!"); break;
			 * 
			 * } break here; }
			 */

		}

	}
}
