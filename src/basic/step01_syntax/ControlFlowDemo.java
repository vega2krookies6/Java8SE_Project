package basic.step01_syntax;

/**
 * 1단계 : 제어문 (조건문 / 반복문)
 *
 * PersonEntity.setSsn() 의 성별 판정, Library 의 도서 검색 루프에서 쓰이는 문법이다.
 */
public class ControlFlowDemo {

	public static void main(String[] args) {

		// 1. if - else if - else
		int grade = 3;
		if (grade < 1) {
			System.out.println("잘못된 학년입니다.");
		} else if (grade <= 2) {
			System.out.println("저학년");
		} else {
			System.out.println("고학년");
		}

		// 2. switch : 값이 정해진 몇 가지 중 하나일 때 사용
		//    주민번호 7번째 자리로 성별을 구하는 예 (PersonEntity 와 동일한 규칙)
		char genderNum = '2';
		switch (genderNum) {
		case '1':
		case '3':
			System.out.println("성별 : 남");
			break;   // break 를 빠뜨리면 아래 case 로 계속 흘러간다.
		case '2':
		case '4':
			System.out.println("성별 : 여");
			break;
		default:
			System.out.println("판별 불가");
		}

		// 3. for : 반복 횟수를 알 때
		int total = 0;
		for (int i = 1; i <= 5; i++) {
			total += i;
		}
		System.out.println("1~5 합계 = " + total);

		// 4. while : 조건이 만족하는 동안 반복
		int money = 10000;
		int withdrawCount = 0;
		while (money >= 3000) {
			money -= 3000;
			withdrawCount++;
		}
		System.out.println("3000원씩 " + withdrawCount + "번 출금, 잔액 " + money);

		// 5. do-while : 최소 1번은 실행된다.
		int n = 0;
		do {
			System.out.println("do-while 은 최소 한 번 실행 : " + n);
			n++;
		} while (n < 1);

		// 6. break / continue
		//    break    : 반복문을 즉시 빠져나온다. (원하는 것을 찾았을 때)
		//    continue : 이번 회차만 건너뛰고 다음 회차로 간다.
		String[] names = { "이순호", "김하늘", "박영선" };
		for (int i = 0; i < names.length; i++) {
			if (names[i].equals("김하늘")) {
				System.out.println("찾음! 인덱스 " + i);
				break;
			}
			System.out.println("검색 중... " + names[i]);
		}

		for (int i = 1; i <= 5; i++) {
			if (i % 2 == 0) {
				continue; // 짝수는 건너뛴다.
			}
			System.out.println("홀수 : " + i);
		}
	}
}
