package basic.step07_polymorphism;

/**
 * 7단계 : 같은 부모를 상속한 또 다른 자식
 */
public class Rectangle extends Shape implements Drawable {

	private double width;
	private double height;

	public Rectangle(double width, double height) {
		super("사각형");
		this.width = width;
		this.height = height;
	}

	public double getWidth() {
		return width;
	}

	public double getHeight() {
		return height;
	}

	@Override
	public double getArea() {
		return width * height;
	}

	@Override
	public void draw() {
		System.out.println(width + " x " + height + " 사각형을 그립니다.");
	}

	/** default 메서드를 재정의할 수도 있다. */
	@Override
	public void printColor() {
		System.out.println("사각형 색상 : 파랑");
	}

	@Override
	public String toString() {
		return "Rectangle(" + width + "x" + height + ")";
	}
}
