package mylab.bank.control;

import mylab.bank.entity.Bank;
import mylab.bank.entity.SavingsAccount;
import mylab.bank.exception.AccountNotFoundException;
import mylab.bank.exception.InsufficientBalanceException;
import mylab.bank.exception.WithdrawalLimitExceededException;

// BankDemo.java - 테스트 클래스
public class BankDemo {
    public static void main(String[] args) {
        Bank bank = new Bank();
        
        try {
            // 계좌 생성
        	System.out.println("=== 계좌 생성 ===");
            String savingsAccount1 = bank.createSavingsAccount("홍길동", 10000, 0.03);
            String checkingAccount1 = bank.createCheckingAccount("김철수", 20000, 5000);
            String savingsAccount2 = bank.createSavingsAccount("이영희", 30000, 0.02);
            
            System.out.println();
            bank.printAllAccounts();
            System.out.println();
            
            // 입금/출금 테스트
            System.out.println("=== 입금/출금 테스트 ===");
            bank.deposit(savingsAccount1, 5000);
            bank.withdraw(checkingAccount1, 3000);
            System.out.println();
            
            // 이자 적용 테스트
            System.out.println("=== 이자 적용 테스트 ===");
            ((SavingsAccount)bank.findAccount(savingsAccount1)).applyInterest();
            
            System.out.println();
            
            // 계좌 이체 테스트
            System.out.println("=== 계좌 이체 테스트 ===");
            bank.transfer(savingsAccount2, checkingAccount1, 5000);
            
            System.out.println();
            bank.printAllAccounts();
            
            // 예외 테스트
            try {
                bank.withdraw(checkingAccount1, 50000); // 잔액 부족
            } catch (InsufficientBalanceException e) {
                System.out.println("예외 발생: " + e.getMessage());
            }
            
            try {
                bank.withdraw(checkingAccount1, 10000); // 출금 한도 초과
            } catch (WithdrawalLimitExceededException e) {
                System.out.println("예외 발생: " + e.getMessage());
            }
            
            try {
                bank.findAccount("AC9999"); // 존재하지 않는 계좌
            } catch (AccountNotFoundException e) {
                System.out.println("예외 발생: " + e.getMessage());
            }
            
        } catch (Exception e) {
            System.out.println("오류 발생: " + e.getMessage());
            e.printStackTrace();
        }
    }
}