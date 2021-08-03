package com.thirdcore;
import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;


@Component(value = "BankAccountRepositoryImpl")
public class BankAccountRepositoryImpl implements BankAccountRepository {
	
	@Autowired
       BankAccount bankAccount;
	
	
	private List<BankAccount> list = new ArrayList<>();
	
	public BankAccountRepositoryImpl() {
		
		list.add(new BankAccount (1,"kamal","Savings",390.00));
		
		list.add(new BankAccount (2,"kate","Savings",210.00));
		
		list.add(new BankAccount (3,"kyle","Current",420.00));
		
		list.add(new BankAccount (4,"pat","Savings",940.00));
	}

	@SuppressWarnings("null")
	@Override
	public double getBalance(int accountId) {
		// TODO Auto-generated method stub
	
	for(BankAccount B : list) {
		if(B.getAccountId() == accountId) {
			return B.accountBalance;
		}
	}
	return (Double) null;
	}
	
	

	@SuppressWarnings("null")
	@Override
	public double updateBalance(int accountId,double accountBalance) {
		for(BankAccount B : list) {
			if(B.getAccountId() == accountId) {		
				B.setAccountBalance(accountBalance);
				return B.accountBalance;
			}
		}
		return (Double) null;
	}
	



}