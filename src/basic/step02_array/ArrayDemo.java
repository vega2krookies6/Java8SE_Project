package basic.step02_array;

/**
 * 2단계 : 배열
 *
 * ManageBook / StatisticsAnalyzer 가 다루는 Publication[] 배열의 기본기다.
 * 배열은 "크기가 고정된" 같은 타입의 묶음이다. (크기를 바꾸려면 List 를 써야 한다)
 */
public class ArrayDemo {

	public static void main(String[] args) {

		// 1. 배열 선언과 생성
		int[] scores = new int[5];   // 크기 5, 기본값 0 으로 초기화된다.
		scores[0] = 90;
		scores[1] = 85;
		System.out.println("scores[0] = " + scores[0]);
		System.out.println("초기화 안 한 칸 = " + scores[4]); // 0
		System.out.println("배열 길이 = " + scores.length);   // 괄호 없는 length

		// 2. 선언과 동시에 값 채우기
		String[] names = { "이순호", "김하늘", "박영선", "정민서" };

		// 3. 일반 for : 인덱스가 필요할 때
		for (int i = 0; i < names.length; i++) {
			System.out.println(i + "번째 : " + names[i]);
		}

		// 4. 향상된 for(Enhanced for) : 인덱스가 필요 없을 때 (실무에서 더 자주 사용)
		for (String name : names) {
			System.out.println("이름 : " + name);
		}

		// 5. 배열을 이용한 합계 / 평균 / 최댓값
		int[] prices = { 9900, 9000, 9800, 11000, 25000 };
		int total = 0;
		int max = prices[0];
		for (int price : prices) {
			total += price;
			if (price > max) {
				max = price;
			}
		}
		double average = (double) total / prices.length; // 정수 나눗셈 주의!
		System.out.println("합계 : " + total);
		System.out.printf("평균 : %.1f%n", average);
		System.out.println("최고가 : " + max);

		// 6. 배열에서 원하는 값 찾기 (Library.findBookByTitle 과 같은 패턴)
		String target = "박영선";
		int foundIndex = -1; // 못 찾았음을 -1 로 표시하는 관례
		for (int i = 0; i < names.length; i++) {
			if (names[i].equals(target)) {
				foundIndex = i;
				break;
			}
		}
		System.out.println(target + " 위치 : " + foundIndex);

		// 7. 자주 만나는 오류 : ArrayIndexOutOfBoundsException
		try {
			System.out.println(names[10]);
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("예외 발생 : 배열 범위를 벗어났습니다. -> " + e.getMessage());
		}

		// 8. 2차원 배열
		int[][] table = { { 1, 2, 3 }, { 4, 5, 6 } };
		for (int[] row : table) {
			for (int value : row) {
				System.out.print(value + " ");
			}
			System.out.println();
		}
	}
}
