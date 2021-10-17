package com.mdtanvirhossain.jp.ch14.unittesting;

import static org.junit.Assert.*;

import org.junit.Test;

public class BankAccountTest {

	@Test(expected = NegativeAmountException.class)
	public void testBankAccountCreation() throws Exception {
		// BankAccount bankAccount = new BankAccount(-50);
		new BankAccount(-50);
	}

	@Test
	public void testBankAccountCreationWithInitialAmount() throws Exception {
		int initialBalance = 50;
		BankAccount bankAccount = new BankAccount(initialBalance);
		assertEquals(initialBalance, bankAccount.getBalance());
	}

	@Test
	public void testDeposit() throws Exception {
		BankAccount bankAccount = new BankAccount();
		int depositAmount = 120;
		bankAccount.deposit(depositAmount);
		assertEquals(depositAmount, bankAccount.getBalance());
	}

	@Test(expected = NegativeAmountException.class)
	public void testNegativeDepositAmount() {
		BankAccount bankAccount = new BankAccount();
		int depositAmount = -120;
		bankAccount.deposit(depositAmount);
	}

	@Test
	public void testWithdraw() throws Exception {
		int initialBalanace = 250;
		BankAccount bankAccount = new BankAccount(initialBalanace);
		bankAccount.withdraw(200);
		assertEquals(50, bankAccount.getBalance());
	}

	@Test(expected = NegativeAmountException.class)
	public void testNegativeWithdrawAmount() {
		BankAccount bankAccount = new BankAccount();
		int withdrawAmount = -120;
		bankAccount.withdraw(withdrawAmount);
	}

	@Test(expected = NotSufficientBalanceException.class)
	public void testInsufficientBalance() {
		BankAccount bankAccount = new BankAccount();
		int withdrawAmount = 120;
		bankAccount.withdraw(withdrawAmount);
	}

}
