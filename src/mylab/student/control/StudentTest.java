package mylab.student.control;

import mylab.student.entity.Student;
import mylab.student.exception.InvalidGradeException;

public class StudentTest {
    public static void main(String[] args) {
    	
    	try {
			Student s = new Student("2023001", "김민수", "컴퓨터공학", 3);
			System.out.println(s.getName() + " / " + s.getMajor() + " / " + s.getGrade() + "학년" );
			System.out.println("5학년으로 변경 ");
			s.setGrade(5); // 오류 출력
		} catch (InvalidGradeException e) {
			System.out.println(e.getMessage());			
		}
        
    }
}