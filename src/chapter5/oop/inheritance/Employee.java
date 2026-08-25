package chapter5.oop.inheritance;
/*
 * 추상클래스는 객체를 생성할 수 없다. Employee e = new Employee(); (x)
 * 추상메서드를 하나 이상 가지고 있으면 무조건 추상클래스가 된다.
 * Super 클래스의 메서드가  추상메서드이면 , Sub 클래스에서 그 추상메서드를 
 * 반드시 오버라이딩 해야 한다. 
 */
public abstract class Employee extends Object {

	private String name;
	protected double salary;

	public Employee() {
		super();
		System.out.println("Employee default constructor 호출됨");
	}

	public Employee(String name, double salary) {
		System.out.println("Employee constructor 호출됨 " + name);
		this.name = name;
		this.salary = salary;
	}

	public String getName() {
		return name;
	}
	//concrete method (body가 있는 메서드)
	public double getSalary() {
		return salary;
	}
	//abstract method (추상메서드 : body가 없고 , 선언만 한 메서드)
	public abstract void manageSalary(double rate);
	
}



