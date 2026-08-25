package workshop.account.exception;

/*
 *	Account의 잔액(balance)가 부족할 때 사용되는 사용자정의 Exception 클래스 
 */
public class InsufficientBalanceException extends Exception {
	//현재잔액
	private int currentBalance;
	
	public InsufficientBalanceException(String errorMessage, int currentBalance) {
		super(errorMessage);
		this.currentBalance = currentBalance;
	}
	
	public int getCurrentBalance() {
		return currentBalance;
	}
}
