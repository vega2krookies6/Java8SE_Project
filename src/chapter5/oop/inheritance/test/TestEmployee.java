package chapter5.oop.inheritance.test;

import chapter5.oop.inheritance.Employee;
import chapter5.oop.inheritance.Manager;
import chapter5.oop.inheritance.MereClerk;

public class TestEmployee {

	public static void main(String[] args) {
		//1. Manager 객체 생성
		//beforePolymorpism();
		afterPolymorphism();
	}
	//poly(다양한) + morphism(변형, 변신하다)
	//"One Interface , Multiple Implementation "
	public static void afterPolymorphism() {
		//Manager  m = new Employee(); (x) 
		
		Employee mgr = new Manager("고길동",100.0,"인사부");
		//dynamic binding (Virtual Method Invocation)
		//왼쪽의 Employee 타입을 따르지 않고, 런타임에 생성되는 오른쪽의 객체에 속한 
		//메서드를 호출하는 것
		mgr.manageSalary(10.0);
		Manager mgr2 = (Manager)mgr;
		System.out.println(mgr2.getDept());
		
		((Manager)mgr).getDept();
		
		Employee clerk1 = new MereClerk("둘리", 90.0);
		Employee clerk2 = new MereClerk("희동", 80.0);
		
		//Employee 타입의 배열을 생성
		Employee[] emps = new Employee[3];
		emps[0] = new Manager("고길동",100.0,"인사부");
		emps[1] = new MereClerk("둘리", 90.0);
		emps[2] = new MereClerk("희동", 80.0);
		
		System.out.println("급여 인상하기 전 ");
		for (int i = 0; i < emps.length; i++) {
			//emps[i]가 Manager 객체로 부터 만들어진 instance 인지를 체크하는 연산자
			if(emps[i] instanceof Manager) {
				Manager manager = (Manager)emps[i];
				System.out.print("관리자 : " + manager.getDept() + " ");
			}
			System.out.println(emps[i].getName() + " " + emps[i].getSalary());
			emps[i].manageSalary(10.0);
		}
		System.out.println("급여 인상한 후");
		for(Employee emp : emps ) {
			System.out.println(emp.getName() + " "+emp.getSalary());
		}
	}
	
	//다형성을 적용하기 전
	public static void beforePolymorpism() {
		Manager mgr1 = new Manager();
		
		System.out.println("급여 인상하기 전 ");
		Manager mgr2 = new Manager("고길동",100.0);
		MereClerk clerk = new MereClerk("둘리", 90.0);
		MereClerk clerk2 = new MereClerk("희동", 80.0);

		System.out.println(mgr2.getName()+ " " + mgr2.getSalary());
		System.out.println(clerk.getName() + " "+clerk.getSalary());
		System.out.println(clerk2.getName() + " "+clerk2.getSalary());
		
		mgr2.manageSalary(10.0);
		clerk.manageSalary(10.0);
		clerk2.manageSalary(10.0);
		
		System.out.println("급여 인상한 후");
		System.out.println(mgr2.getName()+ " " + mgr2.getSalary());
		System.out.println(clerk.getName() + " "+clerk.getSalary());
		System.out.println(clerk2.getName() + " "+clerk2.getSalary());
		
		//Employee  emp = new Employee();		
	}
	

}





