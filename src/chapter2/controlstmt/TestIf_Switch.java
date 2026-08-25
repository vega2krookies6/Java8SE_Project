package chapter2.controlstmt;

import java.util.Calendar;
/**
 * 현재날짜의 요일을 정수값으로 가져와서 문자열 매핑하는 클래스
 * if 문을 switch 문으로 변경하여 작성해봄
 * @author 백명숙
 * @version  ver1.0
 */
public class TestIf_Switch {
	/**
	 * main() 은 실행가능한 메서드이다. 
	 * @param args  여러개의 문자열
	 */
	public static void main(String[] args) {
		//1. Calendar 객체를 생성
		Calendar calendar = Calendar.getInstance();
		System.out.println(calendar.get(Calendar.DAY_OF_WEEK));
		int dayOfWeek = calendar.get(Calendar.DAY_OF_WEEK);
		if(dayOfWeek == 1) {
			System.out.println("일요일");
		}else if(dayOfWeek == 2) {
			System.out.println("월요일");
		}else if(dayOfWeek == 3) {
			System.out.println("화요일");
		}
		
		System.out.println("switch 구문 시작");
		String dayStr = getDayOfWeek(dayOfWeek);
		System.out.println(dayStr);
	}//main
	
	/**
	 * int 타입의 요일값을 받아서 String 타입의 문자열로 변환해주는 메서드
	 * @param day  int타입의 요일값
	 * @return  String타입의 요일문자열
	 */
	public static String getDayOfWeek (int day) {
		//dayOfWeekStr은 로컬변수 임, 로컬변수 메서드 내부에 선언된 변수를 말함
		//로켤변수는 반드시 선언하고 사용할때는 명시적인 초기화가 필요하다.
		String dayOfWeekStr = null;
		switch (day) {
		case 1:
			dayOfWeekStr="일요일";
			break;
		case 2:
			dayOfWeekStr="월요일";
			break;
		case 3:
			dayOfWeekStr="화요일";
			break;
		case 4:
			dayOfWeekStr="수요일";
			break;
		case 5:
			dayOfWeekStr="목요일";
			break;
		case 6:
			dayOfWeekStr="금요일";
			break;
		case 7:
			dayOfWeekStr="토요일";
			break;
		default:
			break;
		}//switch
		
		return dayOfWeekStr;
	}
	
	

}


















