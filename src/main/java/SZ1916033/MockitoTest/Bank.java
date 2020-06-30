package SZ1916033.MockitoTest;

import java.util.Scanner;

public class Bank {
	private User user=new User();
	private MoneyChange money=new MoneyChange();
	public void UserSet(User usr,MoneyChange mny){
		user=usr;
		money=mny;
	}
	public void ShowUser() {
		System.out.println(user.getName());
		System.out.println(user.getAddress());
		System.out.println(user.getBalance());
	}
	public double depositMoney(double x) {
		return money.depositeMoney(user.getBalance(), x);
	}
	public double drawMoney(double x) {
		return money.drawMoney(user.getBalance(), x);
	}
	public static void main(String[] args){
		System.out.println("欢迎使用本银行");
	}
}
