package basic.step07_polymorphism;

/**
 * 7단계 : 추상 클래스 상속 + 인터페이스 구현
 *
 * workshop.animal.entity.Cat 이 Animal 을 상속하고 Pet 을 구현한 것과 같은 형태다.
 */
public class Circle extends Shape implements Drawable {

	private static final double PI = 3.141592;

	private double radius;

	public Circle(double radius) {
		super("원");
		this.radius = radius;
	}

	public double getRadius() {
		return radius;
	}

	/** 추상 메서드는 반드시 구현해야 한다. */
	@Override
	public double getArea() {
		return PI * radius * radius;
	}

	/** 인터페이스의 메서드도 반드시 구현해야 한다. */
	@Override
	public void draw() {
		System.out.println("반지름 " + radius + " 짜리 원을 그립니다.");
	}

	@Override
	public String toString() {
		return "Circle(반지름=" + radius + ")";
	}
}
