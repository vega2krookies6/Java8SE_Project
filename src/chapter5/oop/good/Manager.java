package chapter5.oop.good;
/* 관리자 클래스 */
public class Manager extends Employee {
	//부서명
	private String deptName;
	
    public Manager (String name, double salary) {
        super(name,salary);
    }
    
    public Manager (String name, double salary, String deptName) {
    	this(name,salary);
    	this.deptName = deptName;
    }
    
    @Override
    public void manageSalary(double rate) {
        salary = salary+ salary*(rate/100);
        salary += 20; // 20만원을 추가로 받는다.
    }
    
    public String getDeptName() {
		return deptName;
	}
    
}
