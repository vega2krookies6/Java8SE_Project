package mylab.bank.exception;

// WithdrawalLimitExceededException.java - 출금 한도 초과 예외
public class WithdrawalLimitExceededException extends InsufficientBalanceException {
    public WithdrawalLimitExceededException(String message) {
        super(message);
    }
}