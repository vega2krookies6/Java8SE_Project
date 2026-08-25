package chapter5.oop.bad;
/* 관리자 클래스 */
public class Manager {
    String name;
    double salary;
    
    public Manager (String name, double salary) {
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
        salary += 20; // 20만원을 추가로 받는다.
    }
}
