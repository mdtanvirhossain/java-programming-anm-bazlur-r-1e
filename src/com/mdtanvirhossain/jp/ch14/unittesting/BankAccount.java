package com.mdtanvirhossain.jp.ch14.unittesting;

import java.text.DecimalFormat;

public class BankAccount {

	public final DecimalFormat MONEY = new DecimalFormat("$#, ##0.00");
	private int balance;

	public BankAccount() {
		balance = 0;
	}

	public BankAccount(int initialBalance) {
		deposit(initialBalance);
	}

	public void deposit(int amount) {
		if (amount < 0) {
			throw new NegativeAmountException("Deposit must be positive");
		} else {
			balance += amount;
		}
	}

	public void withdraw(int amount) {
		if (amount < 0) {
			throw new NegativeAmountException("Deposit must be positive");
		}

		if (amount > balance) {
			throw new NotSufficientBalanceException(
					"Withdrawl amount must be positive and can't grater than the balance");
		} else {
			balance -= amount;
		}
	}

	public int getBalance() {
		return balance;
	}

	@Override
	public String toString() {
		return ("balance is" + MONEY.format(balance));
	}

}
