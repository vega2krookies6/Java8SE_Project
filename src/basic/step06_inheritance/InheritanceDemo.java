package basic.step06_inheritance;

/**
 * 6단계 : 상속 확인
 */
public class InheritanceDemo {

	public static void main(String[] args) {

		Employee e = new Employee("김사원", 3000000, "개발팀");
		Manager m = new Manager("박팀장", 5000000, "개발팀", 1000000);

		// 1. 자식은 부모의 메서드를 그대로 쓸 수 있다.
		System.out.println(e.getName() + " / " + m.getName());

		// 2. 오버라이딩된 메서드는 자식 것이 실행된다.
		System.out.println("사원 급여 : " + e.calculateSalary());
		System.out.println("팀장 급여 : " + m.calculateSalary()); // 기본급 + 보너스

		// 3. 부모에서 물려받은 printInfo() 안의 calculateSalary() 도
		//    실제 객체(Manager)의 것이 호출된다. → 다형성의 핵심
		e.printInfo();
		m.printInfo();

		// 4. toString() 오버라이딩 결과
		System.out.println(e);
		System.out.println(m);

		// 5. 부모 타입 변수로 자식 객체를 담을 수 있다. (업캐스팅)
		Employee ref = new Manager("이팀장", 4800000, "기획팀", 800000);
		System.out.println("업캐스팅 후 급여 : " + ref.calculateSalary()); // 자식 메서드 실행

		// 단, 부모 타입 변수로는 자식에만 있는 메서드를 호출할 수 없다.
		// ref.approve("휴가원");  // 컴파일 오류
		// 필요하면 다운캐스팅을 한다. (다음 단계에서 자세히)
		if (ref instanceof Manager) {
			((Manager) ref).approve("휴가원");
		}
	}
}
