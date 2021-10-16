package com.mdtanvirhossain.jp.ch14.unittesting;

@SuppressWarnings("serial")
public class NotSufficientBalanceException extends RuntimeException {
	public NotSufficientBalanceException(String message) {
		super(message);
	}
}
