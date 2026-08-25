package basic.step01_syntax;

/**
 * 1단계 : 연산자
 *
 * ShoppingCart 의 총합 계산, Bank 의 입출금 검사에서 쓰이는 연산자들을 정리한다.
 */
public class OperatorDemo {

	public static void main(String[] args) {

		// 1. 산술 연산자
		int a = 17;
		int b = 5;
		System.out.println("a + b = " + (a + b));
		System.out.println("a - b = " + (a - b));
		System.out.println("a * b = " + (a * b));
		System.out.println("a / b = " + (a / b)); // 정수 나눗셈 : 3
		System.out.println("a % b = " + (a % b)); // 나머지 : 2

		// 2. 복합 대입 연산자 : total += item.getPrice() 형태로 자주 사용
		int total = 0;
		total += 9900;
		total += 11000;
		System.out.println("total = " + total);

		// 3. 증감 연산자 : 카운트 누적에 사용 (예: nextAccountNumber++)
		int count = 0;
		count++;              // 후위 : 쓰고 나서 증가
		++count;              // 전위 : 증가하고 나서 씀
		System.out.println("count = " + count);

		// 4. 비교 연산자 : 결과는 항상 boolean
		System.out.println("a > b  : " + (a > b));
		System.out.println("a == b : " + (a == b));
		System.out.println("a != b : " + (a != b));

		// 5. 논리 연산자
		int grade = 3;
		boolean valid = (grade >= 1) && (grade <= 4); // 그리고
		System.out.println("유효한 학년인가? " + valid);
		System.out.println("범위 밖인가? " + ((grade < 1) || (grade > 4))); // 또는
		System.out.println("부정 : " + !valid);

		// 6. 삼항 연산자 : 간단한 if-else 를 한 줄로
		double amount = 50000;
		double limit = 30000;
		String result = (amount > limit) ? "한도 초과" : "출금 가능";
		System.out.println("출금 판정 : " + result);

		// 7. 문자열 결합 : + 의 한쪽이 String 이면 결합이 된다.
		System.out.println("1 + 2 = " + 1 + 2);     // "12"  <- 왼쪽부터 순서대로 결합
		System.out.println("1 + 2 = " + (1 + 2));   // "3"   <- 괄호로 먼저 계산
	}
}
