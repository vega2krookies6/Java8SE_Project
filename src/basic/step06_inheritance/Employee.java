package basic.step06_inheritance;

/**
 * 6단계 : 상속 - 부모 클래스
 *
 * mylab.bank.entity.Account 와 같은 자리다.
 * 공통 속성과 공통 동작을 부모에 모아두고 자식이 물려받는다.
 */
public class Employee {

	// private 이면 자식이 직접 접근할 수 없고 getter/setter 로만 접근한다.
	private String name;
	private int baseSalary;

	// protected 는 자식 클래스에서 직접 접근할 수 있다. (workshop.animal.Animal 의 legs 와 동일)
	protected String department;

	public Employee(String name, int baseSalary, String department) {
		this.name = name;
		this.baseSalary = baseSalary;
		this.department = department;
	}

	public String getName() {
		return name;
	}

	public int getBaseSalary() {
		return baseSalary;
	}

	public String getDepartment() {
		return department;
	}

	/** 급여 계산 : 자식이 재정의(오버라이딩)할 수 있다. */
	public int calculateSalary() {
		return baseSalary;
	}

	/** 자식이 그대로 물려받아 쓰는 메서드 */
	public void printInfo() {
		System.out.println(name + " (" + department + ") 급여 : " + calculateSalary() + "원");
	}

	@Override
	public String toString() {
		return "이름: " + name + ", 부서: " + department + ", 기본급: " + baseSalary + "원";
	}
}
