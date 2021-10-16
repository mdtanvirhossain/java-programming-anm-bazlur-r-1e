package com.mdtanvirhossain.jp.ch14.unittesting;

@SuppressWarnings("serial")
public class NegativeAmountException extends RuntimeException {

	public NegativeAmountException() {

	}

	public NegativeAmountException(String message) {
		super(message);
	}
}
