package basic.step10_layer.entity;

/**
 * 10단계 : entity 패키지의 역할
 *
 * entity = "데이터를 담는 클래스".
 * 화면 출력이나 검색 같은 기능은 넣지 않고, 자기 자신의 상태만 관리한다.
 * (mylab.book.entity.Publication, workshop.person.entity.PersonEntity 와 같은 자리)
 */
public class Member {

	private String id;
	private String name;
	private int age;
	private boolean active; // 활동 회원 여부

	public Member() {
	}

	public Member(String id, String name, int age) {
		this.id = id;
		this.name = name;
		this.age = age;
		this.active = true;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public boolean isActive() { // boolean 의 getter 는 관례상 is~ 로 시작한다.
		return active;
	}

	public void setActive(boolean active) {
		this.active = active;
	}

	/** 성인 여부를 스스로 판단한다. (자기 데이터에 대한 판단은 entity 가 하는 것이 좋다) */
	public boolean isAdult() {
		return age >= 19;
	}

	@Override
	public String toString() {
		return String.format("[%s] %s (%d세) - %s", id, name, age, active ? "활동" : "휴면");
	}
}
