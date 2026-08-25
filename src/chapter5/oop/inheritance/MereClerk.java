package chapter5.oop.inheritance;
//평사원
public class MereClerk extends Employee {
	public MereClerk() {
		System.out.println("MereClerk default constructor 호출됨");
	}

	public MereClerk(String name, double salary) {
//		this.name = name;
//		this.salary = salary;
//		System.out.println("");   super()는 문장의 첫번째 줄에 와야 한다.
		super(name,salary);
		System.out.println("MereClerk constructor 호출됨 " + name);
	}
	
	//급여계산
	public void manageSalary(double rate) {
		salary = salary + salary*(rate/100);
	}
	
}
