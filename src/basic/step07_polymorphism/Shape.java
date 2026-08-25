package basic.step07_polymorphism;

/**
 * 7단계 : 추상 클래스
 *
 * workshop.animal.entity.Animal 과 같은 자리다.
 *
 *   - abstract 메서드 : 선언만 있고 본문이 없다. 자식이 반드시 구현해야 한다.
 *   - abstract 클래스 : 객체를 직접 만들 수 없다. (new Shape() 불가)
 *                       공통 필드와 공통 구현은 그대로 가질 수 있다.
 */
public abstract class Shape {

	protected String name; // 자식이 직접 접근할 수 있도록 protected

	protected Shape(String name) {
		this.name = name;
	}

	public String getName() {
		return name;
	}

	/** 넓이 계산 방법은 도형마다 다르므로 자식에게 맡긴다. */
	public abstract double getArea();

	/** 공통 동작은 부모가 구현해 둔다. */
	public void printArea() {
		System.out.printf("%s 의 넓이 : %.2f%n", name, getArea());
	}
}
