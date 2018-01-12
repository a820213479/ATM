package com.feicui.atm;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class TransferAccounts {
	private User user;

	public TransferAccounts(User user) {

		this.user = user;
	}

	Scanner scanner = new Scanner(System.in);

	SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss E");
	String ta = sdf.format(new Date());
	
	public void transferAccounts() {
		here: while (true) {
			while (true) {
				System.out.println("请输入对方银行卡号:");
				String indexCardNumber = scanner.next();

				if (indexCardNumber.length() == 12) {

					System.out.println("请输入转账金额:");
					double indexBalance = scanner.nextDouble();

					if (indexBalance >= 0 && indexBalance <= user.getBalance()) {

						System.out.println("1.确认\n2.重新输入\n3.返回主菜单");

						String index = scanner.next();

						while (true) {
							if (index.equals("1")) {

								System.out.println("1.确认转账\n2.返回上一级\n3.退卡");
								String index2 = scanner.next();

								if (index2.equals("1")) {
									user.setBalance_t(user.getBalance());
									double bal = user.getBalance() - indexBalance;
									user.setBalance(bal);
									user.setTtime(ta);
									
									System.out.println("成功转账:" + indexBalance + "元");
									System.out.println("存款时间:" + ta);
									System.out.println("转账成功,正在返回主菜单!");
									System.out.println("返回主菜单成功!");
									break here;

								} else if (index2.equals("2")) {

									System.out.println("正在返回上一级...");
									break;

								} else if (index2.equals("3")) {

									ServiceMain serviceMain = new ServiceMain();
									serviceMain.Login();

								} else {

									System.out.println("输入有误,请重新输入!");
								}

							} else if (index.equals("2")) {

								break;

							} else if (index.equals("3")) {

								break here;

							} else {
								System.out.println("输入有误,请重新输入!");
							}

						}

					} else if (indexBalance > user.getBalance()) {

						System.out.println("余额不足!");

					} else {

						System.out.println("输入有误,请重新输入!");

					}

				} else {
					System.out.println("账号长度输入有误,请重新输入!");
					break;
				}
			}
		}
	}
}
