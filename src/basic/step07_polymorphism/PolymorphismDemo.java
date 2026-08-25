package basic.step07_polymorphism;

/**
 * 7단계 : 다형성 확인
 *
 * ShoppingCart.calculateDiscountedPrice() 와 StatisticsAnalyzer 가
 * instanceof 로 타입을 구분하는 이유를 여기서 이해한다.
 */
public class PolymorphismDemo {

	public static void main(String[] args) {

		// 1. 하나의 객체를 세 가지 타입으로 참조할 수 있다. (workshop.animal.AnimalTest 와 동일)
		Circle c1 = new Circle(5);      // 자기 타입     : 모든 메서드 사용 가능
		Shape c2 = new Circle(3);       // 부모 타입     : Shape 의 메서드만 사용 가능
		Drawable c3 = new Circle(1);    // 인터페이스 타입 : Drawable 의 메서드만 사용 가능

		c1.draw();
		c1.printArea();
		c2.printArea();                 // Shape 의 메서드 → OK
		// c2.draw();                   // 컴파일 오류 : Shape 에는 draw() 가 없다.
		c3.draw();                      // Drawable 의 메서드 → OK
		c3.printColor();                // default 메서드

		System.out.println("---------------------------------");

		// 2. 다형성의 진짜 가치 : 부모 타입 배열에 서로 다른 자식을 담는다.
		//    (Publication[] 안에 Novel, Magazine, ReferenceBook 을 담는 것과 같다)
		Shape[] shapes = { new Circle(2), new Rectangle(3, 4), new Circle(1.5) };

		double total = 0;
		for (Shape shape : shapes) {
			shape.printArea();          // 각 객체의 getArea() 가 실행된다.
			total += shape.getArea();
		}
		System.out.printf("넓이 합계 : %.2f%n", total);

		System.out.println("---------------------------------");

		// 3. instanceof 로 실제 타입을 확인하고 다운캐스팅한다.
		//    타입별로 다른 처리를 해야 할 때 쓴다. (ShoppingCart 의 할인율과 같은 패턴)
		for (Shape shape : shapes) {
			if (shape instanceof Circle) {
				Circle circle = (Circle) shape;       // 다운캐스팅
				System.out.println("원 - 반지름 : " + circle.getRadius());
			} else if (shape instanceof Rectangle) {
				Rectangle rect = (Rectangle) shape;
				System.out.println("사각형 - 가로 : " + rect.getWidth());
			}
		}

		// 4. instanceof 없이 잘못 캐스팅하면 ClassCastException 이 발생한다.
		try {
			Shape shape = new Circle(1);
			Rectangle wrong = (Rectangle) shape;
			System.out.println(wrong);
		} catch (ClassCastException e) {
			System.out.println("예외 발생 : 잘못된 형변환입니다.");
		}

		System.out.println("---------------------------------");

		// 5. 매개변수를 부모 타입으로 받으면 모든 자식을 처리할 수 있다.
		describe(new Circle(10));
		describe(new Rectangle(1, 2));
	}

	/** Shape 을 상속한 어떤 클래스가 새로 생겨도 이 메서드는 고칠 필요가 없다. */
	public static void describe(Shape shape) {
		System.out.printf("[%s] 넓이 %.2f%n", shape.getName(), shape.getArea());
	}
}
