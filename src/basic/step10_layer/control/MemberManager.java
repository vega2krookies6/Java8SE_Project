package basic.step10_layer.control;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import basic.step10_layer.entity.Member;
import basic.step10_layer.exception.MemberNotFoundException;

/**
 * 10단계 : control 패키지의 역할
 *
 * control = "entity 여러 개를 모아서 관리하는 클래스".
 * 등록 / 검색 / 삭제 / 통계 같은 기능을 담당한다.
 * (mylab.bank.entity.Bank, mylab.library.entity.Library,
 *  workshop.person.control.PersonManagerArrayList 와 같은 역할)
 */
public class MemberManager {

	/** 회원 목록 (List 는 크기가 자동으로 늘어난다) */
	private List<Member> members;

	/** 자동 증가 ID 에 쓰는 번호 */
	private int nextNumber;

	private static final String ID_PREFIX = "M";

	public MemberManager() {
		this.members = new ArrayList<>();
		this.nextNumber = 1001;
	}

	/**
	 * 회원을 등록하고 발급된 ID 를 반환한다.
	 * @return 자동 생성된 회원 ID
	 */
	public String register(String name, int age) {
		String id = generateId();
		members.add(new Member(id, name, age));
		System.out.println("등록 완료 : " + id + " / " + name);
		return id;
	}

	/** ID 를 자동 생성한다. 내부에서만 쓰므로 private */
	private String generateId() {
		return ID_PREFIX + (nextNumber++);
	}

	/**
	 * ID 로 회원을 찾는다.
	 * @throws MemberNotFoundException 해당 ID 의 회원이 없을 때
	 */
	public Member findById(String id) throws MemberNotFoundException {
		for (Member member : members) {
			// 문자열 비교는 반드시 equals()
			if (member.getId().equals(id)) {
				return member;
			}
		}
		throw new MemberNotFoundException(id + " 회원을 찾을 수 없습니다.");
	}

	/** 이름으로 찾는다. 동명이인이 있을 수 있으므로 List 로 반환한다. */
	public List<Member> findByName(String name) {
		List<Member> result = new ArrayList<>();
		for (Member member : members) {
			if (member.getName().equals(name)) {
				result.add(member);
			}
		}
		return result;
	}

	/**
	 * 회원을 삭제한다.
	 * @return 삭제 성공 여부
	 */
	public boolean remove(String id) {
		for (int i = 0; i < members.size(); i++) {
			if (members.get(i).getId().equals(id)) {
				Member removed = members.remove(i);
				System.out.println("삭제 완료 : " + removed.getName());
				return true;
			}
		}
		return false;
	}

	/** 성인/미성년 인원수를 세어 Map 으로 반환한다. */
	public Map<String, Integer> countByAgeGroup() {
		Map<String, Integer> result = new HashMap<>();
		for (Member member : members) {
			String group = member.isAdult() ? "성인" : "미성년";
			result.put(group, result.getOrDefault(group, 0) + 1);
		}
		return result;
	}

	/** 평균 나이를 구한다. 회원이 없으면 0 을 반환한다. */
	public double getAverageAge() {
		if (members.isEmpty()) {
			return 0;
		}
		int total = 0;
		for (Member member : members) {
			total += member.getAge();
		}
		return (double) total / members.size(); // 정수 나눗셈 주의
	}

	/** 전체 목록을 출력한다. */
	public void printAll() {
		System.out.println("===== 회원 목록 (" + members.size() + "명) =====");
		for (Member member : members) {
			System.out.println(member); // toString() 자동 호출
		}
		System.out.println("================================");
	}

	/** 원본 목록이 외부에서 변경되지 않도록 복사본을 반환한다. */
	public List<Member> getAllMembers() {
		return new ArrayList<>(members);
	}
}
