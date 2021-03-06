package by.bsu.AccountsMVN;

import by.bsu.AccountsMVN.io.ATM;
import by.bsu.AccountsMVN.logic.ATMController;
import by.bsu.AccountsMVN.logic.Bank;
import by.bsu.AccountsMVN.model.BaseAccount;
import by.bsu.AccountsMVN.model.OverdraftAccount;

public class Run {
	public static void main(String[] args) {
		Bank bank = new Bank();
		ATM atm = new ATM();
		ATMController controller = new ATMController(bank, atm);
		BaseAccount account1 = new BaseAccount(100, 88888888, 1234);
		BaseAccount account2 = new BaseAccount(1000);
		OverdraftAccount account3 = new OverdraftAccount(10000, 0.1);
		bank.addAccount(account1);
		bank.addAccount(account2);
		bank.addAccount(account3);
		System.out.println(account1.toString());
		System.out.println(account2.toString());
		System.out.println(account3.toString());
		controller.start("ATM Model 0.0.1");
	}
}