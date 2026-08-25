package chapter5.oop.myabstract;

/*
 * 추상클래스는 추상메서드만 가질 수 있다.(X)
 * 추상클래스는 추상메서드와 일반 메서드 둘 다 가질 수 있다.(O)
 * 인터페이스는 추상메서드만 가질 수 있다.(O)
 * 인터페이스는 추상메서드와 일반 메서드 둘 다 가질 수 있다.(X)
 * Super 클래스의 추상메서드를 Sub클래스에서 구현하지 않아도 된다.(X)
 * Super 클래스의 추상메서드는 Sub클래스에서 반드시 구현해야 한다.(O)
 * 추상클래스는 객체를 생성할 수 있다.(X)
 * 추상클래스는 반드시 상속해라 (O)
 */
public abstract class EmptyCan {
	public abstract void printContent();
	public abstract void printName();
	
	public void sayHello() {
		
	}
}
