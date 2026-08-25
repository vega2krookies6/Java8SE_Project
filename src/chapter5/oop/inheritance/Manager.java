package chapter5.oop.inheritance;
//관리자
public class Manager extends Employee {
	String dept;
	
	public Manager() {
		//super();
		System.out.println("Manager default constuctor 호출됨");
	}

	public Manager(String name, double salary) {
//		this.name = name;
//		this.salary = salary;
		super(name, salary);
		System.out.println("Manager 생성자 호출됨 " + name );
	}
	
	public Manager(String name, double salary, String dept) {
//		this.name = name;
//		this.salary = salary;
		this(name,salary);
		this.dept = dept;
		System.out.println("Manager 생성자 호출됨 " + dept);
	}

	public String getDept() {
		return dept;
	}
	//급여계산
	//@Override
	/*
	 * @Override 어노테이션의 역할
	 * 오버라이딩 규칙(선언부는 같고, 구현부만 다름)을 준수 했는지 체크해 주는 역할
	 */
	public void manageSalary(double rate) {
		super.salary = salary + salary*(rate/100);
		salary += 20; //20만원 추가로 받음
	}
	
}
