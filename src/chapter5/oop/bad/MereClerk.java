package chapter5.oop.bad;
/* 평사원 클래스 */
public class MereClerk {
    String name;
    double salary;
    
    public MereClerk (String name, double salary) {
        this.name = name;
        this.salary = salary;
    }
    
    public String getName() {
        return this.name;
    }
    public double getSalary() {
        return this.salary;
    }
    
    public void manageSalary(double rate) {
        salary = salary+ salary*(rate/100);
    }
}
