package basic.step01_syntax;

/**
 * 1단계 : String 다루기
 *
 * PersonManagerArrayList 의 이름 비교(equals), PersonEntity 의 charAt(6),
 * StatisticsAnalyzer 의 substring(0, 4) 이 왜 그렇게 쓰였는지 확인한다.
 */
public class StringDemo {

	public static void main(String[] args) {

		String title = "실용주의프로그래머";

		// 1. 기본 메서드
		System.out.println("길이       : " + title.length());
		System.out.println("첫 글자    : " + title.charAt(0));
		System.out.println("부분 문자열: " + title.substring(0, 4)); // 0 이상 4 미만
		System.out.println("포함 여부  : " + title.contains("주의"));
		System.out.println("위치       : " + title.indexOf("프로그래머"));

		// 2. 날짜 문자열에서 연도만 뽑기 (StatisticsAnalyzer 와 같은 방식)
		String publishDate = "2007-01-14";
		String year = publishDate.substring(0, 4);
		System.out.println("출판 연도 : " + year);

		// 3. 주민번호 7번째 자리로 성별 구하기 (PersonEntity 와 같은 방식)
		String ssn = "7212121028102";
		char genderNum = ssn.charAt(6); // 인덱스는 0부터 시작하므로 7번째는 6
		System.out.println("성별 코드 : " + genderNum);

		// 4. ★가장 중요★ 문자열 비교는 == 이 아니라 equals()
		//    == 는 "같은 객체인가"를, equals() 는 "같은 내용인가"를 비교한다.
		String s1 = "김하늘";
		String s2 = "김하늘";
		String s3 = new String("김하늘");

		System.out.println("s1 == s2      : " + (s1 == s2));      // true  (같은 상수풀 객체)
		System.out.println("s1 == s3      : " + (s1 == s3));      // false (새로 만든 객체)
		System.out.println("s1.equals(s3) : " + s1.equals(s3));   // true  ← 항상 이렇게 비교
		System.out.println("대소문자 무시 : " + "ABC".equalsIgnoreCase("abc"));

		// 반면 char, int 같은 기본형은 == 로 비교한다. (PersonManagerArrayList 참고)
		char g = '여';
		System.out.println("char 비교 : " + (g == '여'));

		// 5. 분리와 결합
		String csv = "이순호,032-392-2932,인천 남동구";
		String[] tokens = csv.split(",");
		for (String token : tokens) {
			System.out.println("토큰 : " + token.trim());
		}

		// 6. 서식 출력 : printf / format
		//    %s 문자열, %d 정수, %f 실수, %,d 천단위 콤마, %n 줄바꿈
		System.out.printf("%s - %,d원%n", title, 25000);
		System.out.printf("평균 : %.2f%%%n", 33.333); // %% 는 % 문자 자체

		// 7. 문자열을 여러 번 이어붙일 때는 StringBuilder 가 효율적이다.
		StringBuilder sb = new StringBuilder();
		for (int i = 1; i <= 3; i++) {
			sb.append("항목").append(i).append(" ");
		}
		System.out.println(sb.toString().trim());
	}
}
