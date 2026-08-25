package workshop.account.control;

import workshop.account.entity.Account;
//ctrl + f11 java run 
public class AccountTest {
	public static void main(String[] args) {
		Account account = new Account();
		
		//setter 메서드를 호출하여 Account 변수의 값을 변경 요청 
		//고객번호 : "A1100", 계좌번호 : "221-22-3477", 잔액 : 100000
		account.setCustId("A1100");
		account.setAcctId("221-22-3477");
		account.deposit(100000);
		
		System.out.println("고객번호 = " + account.getCustId());
		System.out.println("계좌번호 = " + account.getAcctId());
		System.out.println("잔액 = " + account.getBalance());
		
		
		Account account2 = new Account("A1200","221-22-3488",20000);
		//getClass().getName() + '@' + Integer.toHexString(hashCode())
		System.out.println(account2.toString());
		
	}
}
