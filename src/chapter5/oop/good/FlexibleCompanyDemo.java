package chapter5.oop.good;

public class FlexibleCompanyDemo {
    public static void main(String[] args) {
    	//Cannot instantiate the type Employee
    	//Employee emp = new Employee();
    	Employee emp1 = new MereClerk("철수", 100);
    	Employee emp2 = new MereClerk("영희", 100);
    	
    	Employee emp3 = new Manager("홍길동", 200,"인사부");
    	System.out.println(emp3.getName());
    	System.out.println(emp3.getSalary());
    	
    	Manager mgr = (Manager)emp3;
    	System.out.println(mgr.getDeptName());
    	
    	Manager emp4 = new Manager("둘리", 200,"개발부");
    	System.out.println(emp4.getName());
    	System.out.println(emp4.getSalary());
    	System.out.println(emp4.getDeptName());
           	
    	//Employee 타입인 배열을 선언  Heterogeneous Array
    	Employee[] emps = new Employee[3];
    	emps[0] = new MereClerk("철수", 100);
    	emps[1] = new MereClerk("영희", 100);
    	emps[2] = new Manager("홍길동", 200,"인사부");
        
        
        for(Employee emp: emps) {
        	System.out.print("현재 월급입니다. ");
        	if(emp instanceof Manager) {
        		System.out.print("부서명 = " + ((Manager)emp).getDeptName() + " 관리자 " );
        	}
        	System.out.println(emp.getName() + "의 현재 월급은 " + emp.getSalary() + " 만원 입니다.");
        	
        	emp.manageSalary(10);
        	
            System.out.print("올린 후의 월급입니다. ");
            System.out.println(emp.getName() + "의 현재 월급은 " + emp.getSalary() + " 만원 입니다.");
        }                

        
   }
}

