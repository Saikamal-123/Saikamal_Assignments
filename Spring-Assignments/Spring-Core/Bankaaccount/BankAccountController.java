package com.thirdcore;
import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class BankAccountController {
	@Autowired
	BankAccount bankAccount;

	List<BankAccount> list1 = new ArrayList<>();

	public BankAccountController () {

		list1.add(new BankAccount (1,"kamal","Savings",300.00));

		list1.add(new BankAccount (2,"pat","Savings",150.00));

		list1.add(new BankAccount (3,"kate","Current",290.00));

		list1.add(new BankAccount (4,"kyle","Savings",500.00));
	}


	@SuppressWarnings("null")
	public double withdraw(int accountId, double balance) {

		for ( BankAccount B :list1 ) {
			if (B.getAccountId() == accountId ) {

				double resultBalance = B.getAccountBalance() - balance;

				return resultBalance;


			}
		}

		return (Double) null;
	}

	public double deposit(int accountId, double balance) {

		for ( BankAccount B :list1 ) {
			if (B.getAccountId() == accountId ) {

				double resultBalance = B.getAccountBalance() + balance;

				return resultBalance;

			}
		}

		return (Double) null;
	}

	public double getBalanace(int accountId) {

		for(BankAccount B : list1) {
			if(B.getAccountId() == accountId) {
				return B.accountBalance;
			}
		}
		return (Double) null;

	}

	public boolean fundTransfer(int fromAccount, int toAccount, double amount) {

		for(BankAccount B : list1 ) {

			if(B.getAccountId()==fromAccount)
			{
				double bal1 = B.getAccountBalance() - amount ;				
				if(B.getAccountId()== toAccount) {

					double name = B.getAccountBalance();

					double bal2 = name + amount ;

					if ( bal2 > name ) {
						return true;
					}
				}				
			}			
		}	  
		return false;
	}

}