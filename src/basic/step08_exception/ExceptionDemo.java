package basic.step08_exception;

/**
 * 8단계 : 예외 처리
 *
 * try-catch-finally, throws, 사용자 정의 예외를 한 번에 확인한다.
 * mylab.bank.control.BankDemo 가 예외를 잡는 방식과 동일하다.
 */
public class ExceptionDemo {

	public static void main(String[] args) {

		// 1. 기본 try - catch
		try {
			int result = 10 / 0;
			System.out.println(result); // 실행되지 않는다.
		} catch (ArithmeticException e) {
			System.out.println("예외 발생 : " + e.getMessage()); // "/ by zero"
		}

		// 2. 여러 예외를 순서대로 잡는다.
		//    ★주의★ 자식 예외를 먼저, 부모 예외(Exception)를 나중에 써야 한다.
		String[] data = { "10", "abc" };
		for (int i = 0; i < 3; i++) {
			try {
				System.out.println("변환 결과 : " + Integer.parseInt(data[i]));
			} catch (NumberFormatException e) {
				System.out.println("숫자 형식이 아닙니다 : " + e.getMessage());
			} catch (ArrayIndexOutOfBoundsException e) {
				System.out.println("배열 범위를 벗어났습니다.");
			} catch (Exception e) {
				System.out.println("그 밖의 예외 : " + e);
			} finally {
				// finally 는 예외 발생 여부와 상관없이 항상 실행된다. (자원 정리에 사용)
				System.out.println("  → " + i + "번째 처리 종료");
			}
		}

		// 3. Unchecked 예외 : 검증 실패를 즉시 알리는 용도로 throw 한다.
		//    (Account.deposit 이 IllegalArgumentException 을 던지는 방식)
		try {
			deposit(-1000);
		} catch (IllegalArgumentException e) {
			System.out.println("입금 실패 : " + e.getMessage());
		}

		// 4. Checked 예외 : 호출하는 쪽이 반드시 처리해야 한다.
		try {
			setAge(25);
			setAge(-5); // 여기서 예외 발생
		} catch (InvalidAgeException e) {
			System.out.println("나이 오류 : " + e.getMessage());
		}

		// 5. 예외를 처리하지 않고 호출한 쪽으로 넘길 때는 throws 를 선언한다.
		try {
			process();
		} catch (InvalidAgeException e) {
			System.out.println("최종 처리 : " + e.getMessage());
		}

		System.out.println("프로그램은 정상 종료됩니다.");
	}

	/**
	 * 금액을 검증한다.
	 * @throws IllegalArgumentException 금액이 0 이하일 때
	 */
	public static void deposit(int amount) {
		if (amount <= 0) {
			throw new IllegalArgumentException("입금액은 양수여야 합니다.");
		}
		System.out.println(amount + "원 입금 완료");
	}

	/**
	 * 나이를 설정한다.
	 * @throws InvalidAgeException 나이가 0~150 범위를 벗어날 때
	 */
	public static void setAge(int age) throws InvalidAgeException {
		if (age < 0 || age > 150) {
			throw new InvalidAgeException("나이는 0~150 사이여야 합니다. 입력값 : " + age);
		}
		System.out.println("나이 설정 완료 : " + age);
	}

	/** 예외를 직접 처리하지 않고 호출자에게 위임한다. */
	public static void process() throws InvalidAgeException {
		setAge(200);
	}
}
