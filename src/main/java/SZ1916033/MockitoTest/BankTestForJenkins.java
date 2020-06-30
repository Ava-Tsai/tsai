package SZ1916033.MockitoTest;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

public class BankTestForJenkins {
	public static void main(String[] args) {
		Bank bank = new Bank();
		User usr = mock(User.class);
		MoneyChange money = mock(MoneyChange.class);
		when(usr.getName()).thenReturn("测试员"); 
		when(usr.getAddress()).thenReturn("测试地址");
		when(usr.getBalance()).thenReturn(100.0);
		bank.UserSet(usr, money);
		bank.ShowUser();
		when(money.depositeMoney(100.0, 20.0)).thenReturn(120.0);
		when(money.drawMoney(100.0, 20.0)).thenReturn(80.0);
		if(bank.depositMoney(20.0)==120.0)
			System.out.println("存钱正确");
		else
			System.out.println("存钱错误");
		if(bank.drawMoney(20.0)==80.0)
			System.out.println("取钱正确");
		else
			System.out.println("取钱错误");
	}
}
