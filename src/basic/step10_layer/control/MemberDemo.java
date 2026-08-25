package basic.step10_layer.control;

import java.util.List;
import java.util.Map;

import basic.step10_layer.entity.Member;
import basic.step10_layer.exception.MemberNotFoundException;

/**
 * 10단계 : 3계층 구조 종합 확인
 *
 * entity(데이터) - control(기능) - exception(오류) 로 나누는 이 구조가
 * mylab / workshop 의 모든 랩에서 반복되는 기본 뼈대다.
 *
 * mylab.bank.control.BankDemo 와 흐름이 똑같다.
 */
public class MemberDemo {

	public static void main(String[] args) {

		MemberManager manager = new MemberManager();

		// 1. 등록
		System.out.println("=== 회원 등록 ===");
		String id1 = manager.register("김하늘", 25);
		manager.register("이순호", 17);
		String id3 = manager.register("박영선", 34);
		manager.register("김하늘", 41); // 동명이인

		System.out.println();
		manager.printAll();

		// 2. 조회 (예외를 던지는 메서드는 반드시 try-catch 로 감싼다)
		System.out.println("\n=== ID 로 조회 ===");
		try {
			Member found = manager.findById(id1);
			System.out.println("조회 결과 : " + found);
			System.out.println("성인인가? " + found.isAdult());

			// 상태 변경
			found.setActive(false);
			System.out.println("휴면 처리 : " + found);

		} catch (MemberNotFoundException e) {
			System.out.println("오류 : " + e.getMessage());
		}

		// 3. 없는 ID 로 조회 → 예외 발생
		System.out.println("\n=== 없는 ID 조회 ===");
		try {
			manager.findById("M9999");
		} catch (MemberNotFoundException e) {
			System.out.println("예외 발생 : " + e.getMessage());
		}

		// 4. 이름으로 조회 (동명이인이므로 List 반환)
		System.out.println("\n=== 이름으로 조회 ===");
		List<Member> sameName = manager.findByName("김하늘");
		System.out.println("김하늘 검색 결과 : " + sameName.size() + "명");
		for (Member member : sameName) {
			System.out.println(" - " + member);
		}

		// 5. 통계
		System.out.println("\n=== 통계 ===");
		Map<String, Integer> group = manager.countByAgeGroup();
		for (String key : group.keySet()) {
			System.out.println(key + " : " + group.get(key) + "명");
		}
		System.out.printf("평균 나이 : %.1f세%n", manager.getAverageAge());

		// 6. 삭제
		System.out.println("\n=== 삭제 ===");
		System.out.println("삭제 성공? " + manager.remove(id3));
		System.out.println("없는 회원 삭제? " + manager.remove("M9999"));

		System.out.println();
		manager.printAll();
	}
}
