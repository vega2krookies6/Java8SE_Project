package chapter5.oop.good;
/* 관리자 클래스 */
public class Manager extends Employee {
    public Manager (String name, double salary) {
        this.name = name;
        this.salary = salary;
    }
    
    public void manageSalary(double rate) {
        salary = salary+ salary*(rate/100);
        salary += 20; // 20만원을 추가로 받는다.
    }
}
