package com.classproblems;

class InsufficientFundException extends RuntimeException{
	InsufficientFundException(String message){
		super(message);
	}
}

public class CustomException {
	public void witehdrawBalanc(int withdrawAmmount) {
		int accountBalance = 65757;
		if(withdrawAmmount > accountBalance) {
			throw new InsufficientFundException("Withdraw balnce cross the account balance.");
		}
	}

	public static void main(String[] args) {
		int withdrawAmmount = 34549787;
		CustomException customException = new CustomException();
		customException.witehdrawBalanc(withdrawAmmount);
		System.out.println("withdraw succefully.");
	}
}
