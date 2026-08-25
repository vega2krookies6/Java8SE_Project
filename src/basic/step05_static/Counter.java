package basic.step05_static;

/**
 * 5단계 : static (클래스 변수 / 클래스 메서드)
 *
 * Bank 가 계좌번호를 AC1000, AC1001 ... 로 자동 증가시키는 원리와 같다.
 *
 *   - 인스턴스 변수 : 객체마다 따로 존재한다.
 *   - static 변수   : 클래스에 하나만 존재하고 모든 객체가 공유한다.
 */
public class Counter {

	/** 지금까지 생성된 객체 수 (모든 객체가 공유) */
	private static int totalCount = 0;

	/** 번호의 시작값 (변하지 않는 값은 static final 상수로) */
	private static final int START_NUMBER = 1000;

	/** 이 객체만의 고유 번호 (객체마다 다름) */
	private int id;

	public Counter() {
		totalCount++;                          // 공유 변수를 증가시키고
		this.id = START_NUMBER + totalCount;   // 그 값을 이 객체의 번호로 사용
	}

	public int getId() {
		return id;
	}

	/** static 메서드는 객체 없이 Counter.getTotalCount() 로 호출한다. */
	public static int getTotalCount() {
		return totalCount;
	}

	/**
	 * static 메서드 안에서는 인스턴스 변수(id)나 this 를 쓸 수 없다.
	 * 객체가 없어도 호출될 수 있기 때문이다.
	 */
	public static String makeCode(String prefix, int number) {
		return prefix + number;
	}

	@Override
	public String toString() {
		return "Counter#" + id;
	}
}
