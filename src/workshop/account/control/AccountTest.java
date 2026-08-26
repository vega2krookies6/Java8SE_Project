package workshop.account.control;

import workshop.account.entity.Account;
import workshop.account.exception.InsufficientBalanceException;
//ctrl + f11 java run 
public class AccountTest {
	public static void main(String[] args) {
		//try - catch 구문
		try {
			Account account2 = new Account("A1200","221-22-3488",20000);
			//getClass().getName() + '@' + Integer.toHexString(hashCode())
			//출금
			account2.withdraw(500000);
			System.out.println(account2.toString());
			
			Account account = new Account();			
			//setter 메서드를 호출하여 Account 변수의 값을 변경 요청 
			//고객번호 : "A1100", 계좌번호 : "221-22-3477", 잔액 : 100000
			account.setCustId("A1100");
			account.setAcctId("221-22-3477");
			account.deposit(100000);
			
			System.out.println("고객번호 = " + account.getCustId());
			System.out.println("계좌번호 = " + account.getAcctId());
			System.out.println("잔액 = " + account.getBalance());					
			
			
		}catch(InsufficientBalanceException exp) {
			System.out.println("Error 메시지 = " + exp.getMessage() + exp.getCurrentBalance());
		}
	}
}
