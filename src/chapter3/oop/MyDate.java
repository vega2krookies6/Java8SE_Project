package chapter3.oop;
//자바빈즈(Java Beans), VO(Value Object)
public class MyDate {
	private int year;
	private int month;
	private int day;
	
	//default constructor
	public MyDate() {
		System.out.println("Default Constructor가 호출됨!!");
	}
	//constructor overloading (생성자 중복정의)
	public MyDate(int year, int month, int day) {
		this.year = year;
		//this.month = month;
		setMonth(month);
		this.day = day;
	}
	
	
	//setter method
	public void setYear(int year) {
		this.year = year;
	}
	//getter 
	public int getYear() {
		return year;
	}
	public int getMonth() {
		return month;
	}
	public void setMonth(int month) {
		if(month >= 1 && month <= 12 ){
			this.month = month;
		}else {
			System.out.println("Month는 1~12 사이의 값만 가능합니다.");
		}
	}
	public int getDay() {
		return day;
	}
	public void setDay(int day) {
		this.day = day;
	}
//	@Override
//	public String toString() {
//		return year + "-" + month + "-" + day;
//	}
	@Override
	public String toString() {
		return "MyDate [year=" + year + ", month=" + month + ", day=" + day
				+ "]";
	}
	
	
	
	
}
