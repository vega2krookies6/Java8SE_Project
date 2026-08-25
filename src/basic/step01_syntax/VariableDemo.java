package basic.step01_syntax;

/**
 * 1단계 : 변수와 자료형
 *
 * mylab/workshop 코드에서 쓰이는 int, double, char, boolean, String 이
 * 각각 어떤 값을 담는지 확인한다.
 * 예) Account 의 balance 는 double, Student 의 grade 는 int,
 *     PersonEntity 의 gender 는 char 이다.
 */
public class VariableDemo {

	public static void main(String[] args) {

		// 1. 기본형(primitive type) : 값 자체를 저장한다.
		int page = 328;                 // 정수
		double balance = 10000.0;       // 실수 (돈 계산에 자주 사용)
		char gender = '남';             // 문자 1개, 작은따옴표
		boolean available = true;       // 참/거짓
		long big = 12345678901L;        // long 은 끝에 L
		float rate = 0.03f;             // float 은 끝에 f

		System.out.println("page = " + page);
		System.out.println("balance = " + balance);
		System.out.println("gender = " + gender);
		System.out.println("available = " + available);
		System.out.println("big = " + big + ", rate = " + rate);

		// 2. 참조형(reference type) : 객체의 주소를 저장한다.
		String title = "실용주의프로그래머";   // 문자열, 큰따옴표
		System.out.println("title = " + title);

		// 3. 상수 : final 을 붙이면 값을 바꿀 수 없다.
		//    하드코딩된 값(할인율, 한도 등)은 이렇게 상수로 빼는 것이 좋다.
		final double DISCOUNT_RATE = 0.9;
		System.out.println("할인가 = " + (9900 * DISCOUNT_RATE));

		// 4. 형변환(casting)
		//    작은 타입 -> 큰 타입 : 자동 변환
		int intValue = 100;
		double doubleValue = intValue;
		System.out.println("자동 형변환 : " + doubleValue);

		//    큰 타입 -> 작은 타입 : 강제 변환, 소수점이 버려진다.
		double price = 9900 * 0.85;
		int discounted = (int) price;
		System.out.println("강제 형변환 : " + price + " -> " + discounted);

		// 5. 정수끼리 나누면 소수점이 사라진다. (통계 계산에서 자주 하는 실수)
		int count = 3;
		int total = 10;
		System.out.println("잘못된 평균 : " + (total / count));          // 3
		System.out.println("올바른 평균 : " + (total / (double) count)); // 3.333...

		// 6. 지역변수는 반드시 초기화 후에 사용해야 한다.
		int sum; // 선언만 한 상태
		sum = 0; // 초기화
		sum += page;
		System.out.println("sum = " + sum);
	}
}
