package basic.step07_polymorphism;

/**
 * 7단계 : 인터페이스
 *
 * workshop.animal.entity.Pet 과 같은 자리다.
 *
 *   - 인터페이스의 메서드는 자동으로 public abstract 이다.
 *   - 클래스는 부모를 하나만 상속(extends)할 수 있지만
 *     인터페이스는 여러 개를 구현(implements)할 수 있다.
 *   - "무엇을 할 수 있는가(능력)" 를 규정하는 약속이다.
 */
public interface Drawable {

	/** 인터페이스의 필드는 자동으로 public static final 상수다. */
	String DEFAULT_COLOR = "검정";

	/** public abstract 은 생략해도 된다. */
	void draw();

	/**
	 * Java 8 부터는 default 메서드로 기본 구현을 줄 수 있다.
	 * 구현 클래스에서 재정의하지 않아도 그대로 사용된다.
	 */
	default void printColor() {
		System.out.println("기본 색상 : " + DEFAULT_COLOR);
	}
}
