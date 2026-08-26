package chapter5.oop.good;

public abstract class Employee {

	private String name;
	protected double salary;

	public Employee() {
		super();
	}

	public Employee(String name, double salary) {
		this.name = name;
		this.salary = salary;
	}


	public String getName() {
	    return this.name;
	}

	public double getSalary() {
	    return this.salary;
	}

	//추상메서드
	public abstract void manageSalary(double rate);
}