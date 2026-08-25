package basic.step06_inheritance;

/**
 * 6단계 : 상속 - 자식 클래스
 *
 * mylab.bank.entity.SavingsAccount 가 Account 를 확장하는 것과 같은 구조다.
 * extends 로 부모의 필드/메서드를 물려받고, 필요한 것만 추가하거나 재정의한다.
 */
public class Manager extends Employee {

	private int bonus; // 자식만 갖는 추가 속성

	public Manager(String name, int baseSalary, String department, int bonus) {
		// 자식 생성자의 첫 줄에서 부모 생성자를 호출해야 한다.
		// 생략하면 컴파일러가 super() 를 자동으로 넣는데,
		// 부모에 기본 생성자가 없으면 컴파일 오류가 난다.
		super(name, baseSalary, department);
		this.bonus = bonus;
	}

	public int getBonus() {
		return bonus;
	}

	/**
	 * 오버라이딩(Overriding) : 부모와 이름/매개변수/반환타입이 같아야 한다.
	 * @Override 는 오타를 컴파일 시점에 잡아주므로 반드시 붙이는 습관을 들인다.
	 */
	@Override
	public int calculateSalary() {
		// super.메서드() 로 부모의 원래 동작을 재사용할 수 있다.
		return super.calculateSalary() + bonus;
	}

	@Override
	public String toString() {
		return super.toString() + ", 보너스: " + bonus + "원";
	}

	/** 자식에만 있는 메서드 */
	public void approve(String document) {
		System.out.println(getName() + " 팀장이 [" + document + "] 을(를) 결재했습니다.");
	}
}
