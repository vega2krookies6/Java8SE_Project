package workshop.account.entity;

import workshop.account.exception.InsufficientBalanceException;

public class Account {
	private String custId;
	private String acctId;
	private int balance;
	
	//default construcotr 선언
	public Account() {
		System.out.println("Account 기본생성자가 호출됨!");
	}
	
	//생성자 중복정의(constructor overloading)
	public Account(String custId, String acctId, int balance) {
		System.out.println("오버로딩된 생성자 호출됨!");
		this.custId = custId;
		this.acctId = acctId;
		this.balance = balance;
	}
	

	//getter method
	public String getCustId() {
		return custId;
	}

	//setter
	public void setCustId(String custId) {
		this.custId = custId;
	}

	public String getAcctId() {
		return acctId;
	}

	public void setAcctId(String acctId) {
		this.acctId = acctId;
	}

	public int getBalance() {
		return balance;
	}
	
	//입금
	public void deposit(int amount) {
		//this.balance = this.balance + amount;
		this.balance += amount;
	}
	
	//출금
	public void withdraw(int amount) 
			throws InsufficientBalanceException {
		if( amount > balance ) {
			//Exception을 강제로 발생시킴
			throw new InsufficientBalanceException("잔액이 부족합니다. 현재 잔액은 = ", this.balance);
		}
		this.balance -= amount;
	}
	
	//Method Overriding
	@Override
	public String toString() {
		return "Account [고객번호=" + custId + ", "
				+ "계좌번호=" + acctId + ", "
						+ "잔액=" + balance + "]";
	}
	
	
	
	
}
