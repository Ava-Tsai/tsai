package test.java.MockitoTest;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

import static org.junit.Assert.*;

import SZ1916033.MockitoTest.Bank;
import SZ1916033.MockitoTest.MoneyChange;
import SZ1916033.MockitoTest.User;
import org.junit.*;

public class BankTest {

	@Before
	public void setUp() throws Exception {
	}
	Bank bank = new Bank();
	User usr = mock(User.class);
	MoneyChange money = mock(MoneyChange.class);
	
	@Test
	public void testShowUser() {
		when(usr.getName()).thenReturn("蔡晓娟");
		when(usr.getAddress()).thenReturn("盐城");
		when(usr.getBalance()).thenReturn(300.0);
		bank.UserSet(usr, money);
		bank.ShowUser();
	}

	@Test
	public void testDepositMoney() {
		when(money.depositeMoney(120.0, 20.0)).thenReturn(140.0);
		bank.UserSet(usr, money);
		assertEquals(null,(double) bank.depositMoney(20.0),(double)120.0,140);
	}

	@Test
	public void testDrawMoney() {
		when(money.drawMoney(120.0, 20.0)).thenReturn(100.0);
		bank.UserSet(usr, money);
		assertEquals(null,(double)bank.drawMoney(120.0),(double)20.0,100);
	}

}
