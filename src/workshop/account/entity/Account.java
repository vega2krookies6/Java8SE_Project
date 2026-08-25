package workshop.account.entity;

public class Account {
	private String custId;
	private String acctId;
	private int balance;

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
	public void withdraw(int amount) {
		this.balance -= amount;
	}
	
	
	
}
